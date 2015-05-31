import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import aula.Interesse;
import aula.PerfilUsuario;

@FacesConverter(value="C")
public class InteresseConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if(arg2!=null) {
			for (Interesse interesse : PerfilUsuario.INTERESSES) {
				if(arg2.equals(interesse.getDescricao())) {
					return interesse;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2!=null && !arg2.equals("")) {
			Interesse interesse=(Interesse) arg2;
			return interesse.getDescricao();
		}
		return null;
	}

}
