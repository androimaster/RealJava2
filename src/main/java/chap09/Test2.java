package chap09;

public class Test2 {}

sealed interface Apple permits MacBook{}

sealed interface Samsung permits GalaxyBook{}

final class MacBook implements Apple{}

final class GalaxyBook implements Samsung{}