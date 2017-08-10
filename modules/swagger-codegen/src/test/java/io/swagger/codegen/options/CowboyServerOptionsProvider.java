package io.swagger.codegen.options;

import io.swagger.codegen.languages.CowboyServerCodegen;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class CowboyServerOptionsProvider implements OptionsProvider {

    public static final String API_FILE_NAME_SUFFIX = "_api";

    @Override
    public String getLanguage() {
        return "cowboy";
    }

    @Override
    public Map<String, String> createOptions() {
        ImmutableMap.Builder<String, String> builder
                = new ImmutableMap.Builder<String, String>();

        return builder
                .put(CowboyServerCodegen.API_FILE_NAME_SUFFIX, API_FILE_NAME_SUFFIX)
                .build();
    }

    @Override
    public boolean isServer() {
        return true;
    }
}
