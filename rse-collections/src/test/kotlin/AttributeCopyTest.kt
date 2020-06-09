import org.junit.Assert
import org.junit.Test
import rs.emulator.attributes.AttributeMap
import rs.emulator.attributes.Copyable

class AttributeCopyTest {

    @Test
    fun attributePutTest() {

        val map = AttributeMap()

        map["test"] = 3

        val value : Int = map["test"]
        Assert.assertTrue("Failed to put attribute in map", value == 3)

    }

    @Test
    fun attributeCopyTest() {

        val map = AttributeMap()

        map["test"] = "Test"

        val copied = map.copy()

        val v : String = copied["test"]
        Assert.assertTrue("Failed to copy map data", v == "Test")

    }

    @Test
    fun attributeAdvancedCopyTest() {
        class Foo(val bar : String) : Copyable<Foo> {
            override fun copy(): Foo {
                return Foo(bar)
            }
        }

        val map = AttributeMap()

        map["test"] = Foo("dang")

        val copied = map.copy()

        val v : Foo = copied["test"]

        Assert.assertTrue("Failed to copy Class Foo", v.bar == "dang")

    }

}