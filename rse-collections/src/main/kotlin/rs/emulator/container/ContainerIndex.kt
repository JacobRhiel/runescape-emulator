package rs.emulator.container

import rs.emulator.Storable

data class ContainerIndex<T : Storable>(val index : Int, var value : T)