/**
 * 
 */
package strategyGame.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import strategyGame.viewbeans.ShowUserViewBean;


/**
 * Controller for the showProfile Page.
 * 
 * @author florian
 */
@RequestScoped
@ManagedBean
public class ShowUserProfileController implements Serializable {

	private static final long serialVersionUID = -341446467315131996L;

	@ManagedProperty(value = "#{showUserViewBean}")
	private ShowUserViewBean showUserViewBean;

	public void init() {
		if (!FacesContext.getCurrentInstance().isPostback())
			showUserViewBean.setName("Ghosty");
	}

	public void doSomething() {

	}

	public ShowUserViewBean getShowUserViewBean() {
		return showUserViewBean;
	}

	public void setShowUserViewBean(ShowUserViewBean showUserViewBean) {
		this.showUserViewBean = showUserViewBean;
	}
}
