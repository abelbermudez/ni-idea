public class App extends Camion{
    public static void main(String[] argst, String marca, String modelo, String año, String kilometraje, String Tipo, String capacidadCarga)throws Exception {
        System.out.println("hello world");

        auto auto=new auto(marca: "toyota", modelo:"corolla", año:"2200", kilometraje:"15500",capacidadCarga:"5",Tipo: "gasolina");
        Camion camion=new Camion((marca: "volvo", modelo:"FH", año:"2012", kilometraje:"754123",capacidadCarga:"2000",Tipo: "diesel"));

        System.out.println("informacion del auto: ");
        auto.mostrarinfo();

        System.out.println("informacion del camion: ");
        camion.mostrarinfo();
        
    }

    private static Object marca(String string, String string2, String string3, String string4, String string5,
            String string6) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'marca'");
    }

}
