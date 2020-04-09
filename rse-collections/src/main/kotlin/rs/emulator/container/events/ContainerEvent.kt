package rs.emulator.container.events

import rs.emulator.Storable
import rs.emulator.container.Container
import rs.emulator.container.ResultSet

class ContainerEvent<T : Storable>(val container : Container<T>, resultSet: ResultSet<T>)