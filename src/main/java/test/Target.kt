package test

class Target {
    fun <R> target(filter: String, mapper: (String) -> R): R = mapper(filter)
}
