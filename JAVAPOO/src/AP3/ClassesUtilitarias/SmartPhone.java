package AP3.ClassesUtilitarias;

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca){
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber) && marca != null && marca.equals(smartPhone.marca);

    }
    @Override
    public String toString(){
        return "Marca: "+this.marca+" Serial: "+this.serialNumber;
    }
    public String getSerialNumber(){
        return this.serialNumber;
    }
    public String getMarca(){
        return this.marca;
    }
}
