package org.everit.json.schema;

import org.everit.json.schema.loader.SchemaLoader;
import org.jsonorg.JSONObject;
import org.jsonorg.JSONTokener;
import org.junit.Test;

public class MetaSchemaTest {

    @Test
    public void validateMetaSchema() {

        JSONObject jsonSchema = new JSONObject(new JSONTokener(
                MetaSchemaTest.class
                        .getResourceAsStream("/org/everit/json/schema/json-schema-draft-04.json")));

        JSONObject jsonSubject = new JSONObject(new JSONTokener(
                MetaSchemaTest.class
                        .getResourceAsStream("/org/everit/json/schema/json-schema-draft-04.json")));

        Schema schema = SchemaLoader.load(jsonSchema);
        schema.validate(jsonSubject);
    }

}
