package test;

import Controller.EmpresaElectricaController;
import DTO.UsuarioResidencialDTO;
import Model.Usuario;
import Model.UsuarioResidencial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Model.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaElectricaControllerTest {

    private EmpresaElectricaController controller;

    @BeforeEach
    public void setUp() {
        controller = EmpresaElectricaController.getInstance();

        // ⚠️ Limpieza manual porque usamos singleton (evitamos interferencia entre tests)
        List<Usuario> usuarios = controller.getUsuarios();
        usuarios.clear();
    }

    @Test
    public void testAltaUsuarioResidencial_casoNormal() {
        // Caso normal: alta de usuario válida
        UsuarioResidencialDTO dto = new UsuarioResidencialDTO(
                "Juan Pérez", 12345678,
                "Calle Falsa", 123, 1, "A", 1000, "Springfield", "Buenos Aires"
        );

        controller.altaUsuarioResidencial(dto);

        List<Usuario> usuarios = controller.getUsuarios();

        assertEquals(1, usuarios.size());
        assertTrue(usuarios.get(0) instanceof UsuarioResidencial);
        assertEquals("Juan Pérez", ((UsuarioResidencial) usuarios.get(0)).getNombre());
    }

    @Test
    public void testAltaUsuarioResidencial_nombreDuplicado_noSeAgrega() {
        // Caso alternativo: nombre duplicado no debería permitir alta

        UsuarioResidencialDTO dto1 = new UsuarioResidencialDTO(
                "Duplicado", 11111111,
                "Calle Uno", 100, 1, "B", 2000, "Ciudad", "Provincia"
        );

        UsuarioResidencialDTO dto2 = new UsuarioResidencialDTO(
                "Duplicado", 22222222,
                "Calle Dos", 200, 2, "C", 3000, "Ciudad2", "Provincia2"
        );

        controller.altaUsuarioResidencial(dto1); // debería agregarse
        controller.altaUsuarioResidencial(dto2); // debería ser rechazado

        List<Usuario> usuarios = controller.getUsuarios();

        // Solo se agrega uno
        assertEquals(1, usuarios.size());
        assertEquals(11111111, ((UsuarioResidencial) usuarios.get(0)).getDni());
    }
}

