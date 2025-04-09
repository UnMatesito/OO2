package ej1.puntoB;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonAdaptee {
    private JSONArray jsonSocios;

    public JsonAdaptee(){
        jsonSocios = new JSONArray();
    }

    private JSONObject socioToJSON(Socio socio){
        JSONObject socioJSON = new JSONObject();
        socioJSON.put("nombre", socio.getNombre());
        socioJSON.put("email", socio.getEmail());
        socioJSON.put("legajo", socio.getLegajo());
        return socioJSON;
    }

    public void addSocio(Socio socio){
        jsonSocios.add(socioToJSON(socio));
    }

    public String toString(){
        return jsonSocios.toJSONString();
    }
}
