// VehiculoCarga.java
public class VehiculoCarga extends vehiculo {
   private int capacidadCarga;

   public VehiculoCarga(String marca, String modelo, int kilometraje, int capacidadCarga) {
       super(marca, modelo, kilometraje, capacidadCarga);
       this.capacidadCarga = capacidadCarga;
   }

   public int getCapacidadCarga() {
       return capacidadCarga;
   }

   public void setCapacidadCarga(int capacidadCarga) {
       this.capacidadCarga = capacidadCarga;
   }

   @Override
   public void mostrarinfo() {
       super.mostrarinfo();
       System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
   }
}


