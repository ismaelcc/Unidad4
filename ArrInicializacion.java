
package arrinicializacion;


public class ArrInicializacion {

    public static void main(String[] args) {
        String[][]nombres = {
            {"pao","jessi","jesus"},
            {"pablo","karla","isma"},
            {"sherlyn","alex","samuel"}
                
        
    };
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println(nombres[i][j] + ",");
            }
            System.out.println();
        }
    }
    
}
