package challonge;

import at.stefangeyer.challonge.Challonge;
import at.stefangeyer.challonge.model.Credentials;
import at.stefangeyer.challonge.rest.RestClient;
import at.stefangeyer.challonge.rest.retrofit.RetrofitRestClient;
import at.stefangeyer.challonge.serializer.Serializer;
import at.stefangeyer.challonge.serializer.gson.GsonSerializer;

public class Connection {
    Credentials credentials = new Credentials(Config.getChallongeUsername(), Config.getChallongeToken());

    Serializer serializer = new GsonSerializer();
    RestClient restClient = new RetrofitRestClient();

    Challonge challonge = new Challonge(credentials, serializer, restClient);


}