package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class DeliveryProvider {

    private int id;
    private String providerName;

    public DeliveryProvider(int id, String providerName) {
        this.id = id;
        this.providerName = providerName;
    }

    public DeliveryProvider() {

    }

    public int getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    @XmlElement(name = "provider_name")
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }


}
