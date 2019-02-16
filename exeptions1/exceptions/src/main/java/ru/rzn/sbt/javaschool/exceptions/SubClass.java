package ru.rzn.sbt.javaschool.exceptions;


import ru.rzn.sbt.javaschool.exceptions.utils.SomeService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * Упражнение 12. Hello Barbara.<br />
 * <br />
 * Создайте в этом пакете ({@link ru.rzn.sbt.javaschool.exceptions}) класс {@code SubClass} - потомок класса
 * {@link SuperClass}. Переопределите метод {@link SuperClass#callService(SomeService)} так, чтобы
 * он вызывал метод {@link SomeService#doSomething()} у полученного в качестве аргумента сервиса
 * {@link SomeService} и в случае успешного выполнения возвращал строку "DONE".<br />
 * <br />
 * Если метод {@link SomeService#doSomething()} выбросит исключение, пробросьте его из метода {@code callService},
 * а если это невозможно, то выбросьте непроверяемое исключение с тем же сообщением, указав исходное исключение
 * в качестве причины.
 */

public class SubClass extends SuperClass{
    public String callService(SomeService service) throws FileNotFoundException {
        try {
            service.doSomething();
        }catch(FileNotFoundException e){
            throw e;
        }
        catch (IOException e) {
            throw new UncheckedIOException(e.getMessage(),e);
        }

        return "DONE";

    }


}
