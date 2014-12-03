package foo.acn.bo;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

@SuppressWarnings("serial")
public abstract class BO implements Serializable {
	@Override
	public String toString() {
		Field f[] = this.getClass().getDeclaredFields();
		AccessibleObject.setAccessible(f, true);
		StringBuffer strBuff = new StringBuffer();

		strBuff.append(this.getClass().getName() + ":\n");
		for (int i = 0; i < f.length; i++) {
			try {
				strBuff.append(f[i].getName() + "=" + f[i].toString()+", ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return strBuff.toString();
	}
}
