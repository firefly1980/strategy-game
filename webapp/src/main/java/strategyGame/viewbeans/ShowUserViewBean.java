/**
 * 
 */
package strategyGame.viewbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * View Bean for Show User profile Page.
 * 
 * @author florian
 */
@ViewScoped
@ManagedBean
public class ShowUserViewBean implements Serializable {

	private static final long serialVersionUID = 7169093813560495744L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
