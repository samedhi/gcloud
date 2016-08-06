package gcloud;

import com.google.cloud.AuthCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.DatastoreOptions.Builder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GCloudDatastore {

    public static Datastore getDatastore() throws FileNotFoundException, IOException {
        DatastoreOptions.Builder optionsBuilder = DatastoreOptions.builder();
        FileInputStream authStream = new FileInputStream(System.getenv("SERVICE_ACCOUNT_DOT_JSON_PATH"));
        AuthCredentials creds = AuthCredentials.createForJson(authStream);

        return optionsBuilder
            .authCredentials(creds)
            .projectId(System.getenv("PROJECT_ID"))
            .build()
            .service();
    }

}
