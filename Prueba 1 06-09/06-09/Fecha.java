
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{    
    private byte dia; // 1 -31
    private byte mes;  //1-12
    private short anio; //>1900   

    public Fecha() {
    }

    public Fecha(byte dia, byte mes, short anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            p("Error, dia fuera de rango");
        }
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            p("Error, mes fuera de rango");
        }
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        if (anio >= 1900) {
            this.anio = anio;
        } else {
            p("Error, año fuera de rango");
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public String fechaConPalabras() {
        String mesTexto = "";
        String fechaTexto = "";
        switch (mes) {
            case 1: {
                mesTexto = "Enero";
                break;
            }
            case 2: {
                mesTexto = "Febrero";
                break;
            }
            case 3: {
                mesTexto = "Marzo";
                break;
            }

            default: {
                mesTexto = "-------";
                break;
            }
        }

        fechaTexto = dia + "-" + mesTexto + "-" + anio;
        return fechaTexto;
    }

    public static void p(Object texto) {
        System.out.println(texto);
    }
}
