package br.org.catolicasc.rh.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.org.catolicasc.rh.model.Job;

public class JobAdapter  extends XmlAdapter<String, Job>{

    @Override
    public Job unmarshal(String v) throws Exception {
        return new Job(v, v, null, null, v);
    }

    @Override
    public String marshal(Job v) throws Exception {
       return v.getCompany();
    }
}
