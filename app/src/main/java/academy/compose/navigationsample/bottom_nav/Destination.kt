package academy.compose.navigationsample.bottom_nav

sealed class Destination(
    val route: String,
    val label: String
    ) {
    object One : Destination("one", "One")
    object Two : Destination("Two", "Two")
}