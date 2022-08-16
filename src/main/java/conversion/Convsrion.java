package conversion;

import com.google.gson.Gson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Convsrion {
    public static void main(String[] args) throws JAXBException {
        String jsonString="{\"context\":{\"headers\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"entityAnnotations\":[],\"entityStream\":{\"committed\":false,\"closed\":false},\"committed\":false,\"mediaType\":{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false},\"links\":[],\"responseCookies\":{},\"acceptableLanguages\":[\"*\"],\"requestCookies\":{},\"acceptableMediaTypes\":[{\"type\":\"*\",\"subtype\":\"*\",\"parameters\":{},\"quality\":1000,\"wildcardType\":true,\"wildcardSubtype\":true}],\"stringHeaders\":{\"Content-Type\":[\"application/json\"]},\"allowedMethods\":[],\"length\":-1},\"status\":200,\"statusInfo\":\"OK\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"mediaType\":{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false},\"cookies\":{},\"links\":[],\"stringHeaders\":{\"Content-Type\":[\"application/json\"]},\"allowedMethods\":[],\"length\":-1,\"headers\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]}}";
        Gson gson=new Gson();
        Model model=gson.fromJson(jsonString,Model.class);

        JAXBContext jaxbContext = JAXBContext.newInstance(Model.class);
        //Marshlling

 /*      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(model, System.out);
        jaxbMarshaller.marshal(model, new File("C:\\Users\\Arslan Ahsan\\Desktop\\tiff\\model.xml"));
*/
         //Unmarshalling New
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Model unmarshalModel = (Model) jaxbUnmarshaller.unmarshal( new File("C:\\Users\\Arslan Ahsan\\Desktop\\tiff\\model.xml") );
        System.out.println(unmarshalModel.toString());

    }

}
