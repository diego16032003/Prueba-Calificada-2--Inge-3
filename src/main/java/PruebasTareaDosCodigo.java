public class PruebasTareaDosCodigo {

    public static boolean isValidPassword(String password) {

        if (password == null) return false;
        if (password.length() < 8) return false;

        boolean tieneMayus = password.matches(".*[A-Z].*");
        boolean tieneNumero = password.matches(".*[0-9].*");

        return tieneMayus && tieneNumero;
    }
}
