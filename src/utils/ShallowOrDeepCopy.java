package utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * A classe {@code ShallowOrDeepCopy} fornece métodos para verificar e criar cópias profundas de objetos.
 * Ela lida tanto com cópias superficiais quanto profundas, com base nas propriedades do objeto.
 *
 * @author Vinícius dos Santos Andrade
 */
public class ShallowOrDeepCopy {

    /**
     * Verifica se o objeto de entrada é {@link Cloneable} e retorna uma cópia profunda, se possível.
     *
     * @param data O objeto a ser verificado e copiado.
     * @return Se {@code data} for {@link Cloneable}, uma cópia profunda de {@code data}.
     *         Caso contrário, o {@code data} original.
     */
    public static Object verifyAndCopy(Object data) {
        if (data instanceof Cloneable)
            return deepCopy(data);
        return data;
    }

    /**
     * Cria uma cópia profunda do objeto de entrada.
     *
     * @param data O objeto a ser copiado profundamente.
     * @return Uma cópia profunda de {@code data}.
     */
    public static Object deepCopy(Object data) {
        try {
            Class<?> x = data.getClass();
            Method method = x.getMethod("clone");
            return method.invoke(data);
        } catch (InvocationTargetException |
                 NoSuchMethodException |
                 IllegalAccessException ignored) {
            return data;
        }
    }
}
