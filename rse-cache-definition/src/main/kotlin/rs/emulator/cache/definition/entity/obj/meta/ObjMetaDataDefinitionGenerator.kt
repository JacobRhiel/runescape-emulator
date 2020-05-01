package rs.emulator.cache.definition.entity.obj.meta

import com.google.gson.Gson
import rs.emulator.buffer.BufferedReader
import rs.emulator.cache.definition.generator.DefinitionGenerator
import rs.emulator.cache.index.IndexConfig
import rs.emulator.cache.index.archive.ArchiveConfig

/**
 *
 * @author Chk
 */
class ObjMetaDataDefinitionGenerator : DefinitionGenerator<ObjMetaDataDefinition>()
{

    override val definitionClass: Class<ObjMetaDataDefinition> = ObjMetaDataDefinition::class.java

    override val indexConfig: IndexConfig = IndexConfig.META_DATA

    override val archive: Int = ArchiveConfig.OBJ.identifier

    override fun decodeHeader(id: Int, reader: BufferedReader): ObjMetaDataDefinition = generate(id, reader)

    override fun generate(id: Int, reader: BufferedReader): ObjMetaDataDefinition = Gson().fromJson(String(reader.byteArray()), ObjMetaDataDefinition::class.java)

}