package rs.emulator.configuration.node

import com.fasterxml.jackson.databind.JsonNode
import rs.emulator.configuration.utilities.StringUtil

/**
 * Extension file for JsonNode.
 * @author Chk
 */

/**
 * Converts [JsonNode]'s [JsonNode.textValue] to a formatted text value based on the delimited string alteration.
 */
fun JsonNode.formattedTextValue(substitutions: Map<String, String>) = StringUtil.expand(asText(), substitutions)