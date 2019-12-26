package H10.task4;

@FunctionalInterface
public interface GenericFunction<T> {
    T change(T source);
}
