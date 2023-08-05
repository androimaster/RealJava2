package chap14;

import static java.lang.annotation.ElementType.RECORD_COMPONENT;

import java.lang.annotation.Target;

public class Sample14 { }

record Sample14Record(@RecordAnno String name, @Sample07AnnoParameter Integer age) { }

@Target(RECORD_COMPONENT)
@interface RecordAnno{ }