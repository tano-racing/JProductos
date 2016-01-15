package aplicaciones.encuentro.jproductos.model;

import org.parceler.Parcel;

/**
 * Created by jlionti on 15/01/2016. MAGYP
 */
@Parcel
public class ResultadoModel {

    public int IdProducto;
    public String Modelo;
    public String Descripcion;
    public String Fecha;

    public ResultadoModel(){ }

    public ResultadoModel(int IdProducto, String Modelo, String Descripcion, String Fecha) {
        this.IdProducto = IdProducto;
        this.Modelo = Modelo;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
    }

    public int getId() { return IdProducto; }
    public String getModelo() { return Modelo; }
    public String getDescripcion() { return Descripcion; }
    public String getFecha() { return Fecha; }
}
