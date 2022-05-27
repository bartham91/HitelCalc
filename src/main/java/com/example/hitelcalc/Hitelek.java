package com.example.hitelcalc;
import java.util.List;

import lombok.Data;

import jakarta.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data

public class Hitelek {

    private String hitel_name;

    @XmlElementWrapper(name = "hitels")
    @XmlElement(name = "hitel")
    private List<Hitel> hitels;
}
