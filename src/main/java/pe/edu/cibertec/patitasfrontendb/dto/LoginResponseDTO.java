package pe.edu.cibertec.patitasfrontendb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*part2 num 3*/

public record LoginResponseDTO(String codigo,String mensaje,String nombreUsuario,String correoUsuario) {


}
