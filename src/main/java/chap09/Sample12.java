package chap09;

class 자동차핸들 {}
sealed interface 현대차 permits 소나타{}
sealed interface 기아차 permits k9, 레이{}

sealed class 소나타 extends 자동차핸들 implements 현대차{}
final class k9 extends 자동차핸들 implements 기아차{}
final class 레이 extends 자동차핸들 implements 기아차{}

non-sealed class 경운기 extends 소나타 {}
class 트for터 extends 경운기 {}

public class Sample12 {}
