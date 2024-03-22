import br.com.util.HibernateUtil;
import org.junit.jupiter.api.Test;

public class TestHibernate {

    @Test
    public void testeHibernateUtil(){
        HibernateUtil.getEntityManager();
    }
}
