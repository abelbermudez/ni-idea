public class auto extends VehiculoPasajeros {
 
    private String tipoCombustible;

   
    public auto(String marca, String modelo, int año, int kilometraje,int numPasajeros,String tipoCombustible) {
        super(marca, modelo, año, kilometraje,numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }
}
