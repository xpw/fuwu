package com.mycompany.fuwu.pattern.template.demo1;

import java.util.List;

public abstract class DoTemp<T extends BaseDO> {
	
	public abstract void insert(T t);
	
	public abstract void update(T target, T orign);

	public abstract void delete(T t);
	
	protected void execute(List<T> target, List<T> orign) {
		if(target != null) {
			for(T t : target) {
				boolean isNeedInsert = true;
				for(T o : orign) {
					if(t.getId() == o.getId()) {
						this.update(t, o);
						isNeedInsert = false;
					}
				}
				if(isNeedInsert) {
					this.insert(t);
				}
			}
		}
		
		if(orign != null) {
			for(T o : orign) {
				boolean isNeedDel = true;
				for(T t : target) {
					if(t.getId() == o.getId()) {
						isNeedDel = false;
					}
				}
				if(isNeedDel) {
					this.delete(o);
				}
			}
		}
	}
}
