package springdemo.entity.aware;

import org.springframework.beans.factory.BeanNameAware;

public class TestBeanNameAware implements BeanNameAware {
    private String id;
    private String name;
    private String address;
    public void setBeanName(String beanName) {
        this.id = beanName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
