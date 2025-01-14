package lavaskin.app.ll.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LeagueService {
    @GET("versions.json")
    Call<Versions> fetchVersions();

    @GET("cdn/{version}/data/en_US/champion.json")
    Call<ChampionsData> fetchChampions(@Path("version") String version);
}