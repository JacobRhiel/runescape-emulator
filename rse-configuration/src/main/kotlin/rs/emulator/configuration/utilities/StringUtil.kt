package rs.emulator.configuration.utilities

import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * @author Netherfoam
 */
object StringUtil
{
    fun expand(template: String, substitutions: Map<String, Any>): String
    {
        var result = ""
        val matcher: Matcher = Pattern.compile("\\{\\{[^}}]*}}").matcher(template)
        var last = 0
        while (matcher.find())
        {
            val start: Int = matcher.start()
            val end: Int = matcher.end()
            var group: String = matcher.group()
            result += template.substring(last, start)
            last = end
            group = group.substring(2, group.length - 2)
            val options = split(group, '|')
            val value = expand(options, substitutions)
            result += value
        }
        result += template.substring(last)
        return result
    }

    fun expand(options: Array<String>, substitutions: Map<String, Any>): String
    {
        for (option in options)
        {
            val value = substitutions[option] ?: continue
            val text = value.toString()
            if (text.isEmpty()) continue
            return text
        }
        return options[options.size - 1]
    }

    private fun split(text: String, delimiter: Char): Array<String>
    {
        // Can't use string.split("\\|") because that splits "hello||" into just "hello" and not {"hello", "", ""} as it should
        val components: LinkedList<String> = LinkedList()
        var start = 0
        var end: Int
        while (text.indexOf(delimiter, start).also { end = it } >= 0)
        {
            val s = text.substring(start, end)
            components.add(s)

            // +1 so we skip the | next.
            start = end + 1
        }
        components.add(text.substring(start, text.length))
        return components.toArray(arrayOfNulls<String>(components.size))
    }
}