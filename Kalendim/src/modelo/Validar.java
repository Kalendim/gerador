
package modelo;


public class Validar {
    /**
     * 
     * @param v
     * @return se o string é válido ou não 
     */
    public static boolean validarNome(String v){
        String exp = "^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ'\\s]+$";
        return v.matches(exp);
    }
    /**
     * 
     * @param v
     * @return retorna se  o número informado é válido
     */
    public static boolean validarNumero(String v){
        String exp = "^[0.0-9.0]{1,20}$";
        return v.matches(exp);
    }    
    /**
     * 
     * @param v
     * @return retorna se o cpf é valido
     */
    public static boolean validarcpf(String v){
        String exp = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}$";
        return v.matches(exp);
    }    
    /**
     * 
     * @param v
     * @return retorna se  a data é valido
     */
    public static boolean validarEmail(String v){
        String exp = "[a-z._-]+@[a-z.]+";
        return v.matches(exp);
    }    
    /**
     * 
     * @param v
     * @return retorna se  a data é valido
     */
    public static boolean validarData(String v){    
        String exp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}$";
        return v.matches(exp);
    }    
}
