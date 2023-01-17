import com.soxhwhat.staticProxy.IRequestable;
import com.soxhwhat.staticProxy.RequestableImpl;
import com.soxhwhat.staticProxy.RequestableProxy;

/**
 * <p>在开始处详细描述该类的作用</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/14 18:18
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class SpringAOPTest {
    public static void main(String[] args) {
        IRequestable requestable = new RequestableImpl();
        IRequestable proxy = new RequestableProxy(requestable);
        proxy.request();
    }
}

