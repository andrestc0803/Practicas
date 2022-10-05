
package comTienda1.dao;

import com.Tienda1.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteDao extends JpaRepository<Cliente, Long>{
        
    }

