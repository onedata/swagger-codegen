package io.swagger.codegen.cowboy;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.languages.CowboyServerCodegen;
import io.swagger.codegen.options.CowboyServerOptionsProvider;

import mockit.Expectations;
import mockit.Tested;

public class CowboyServerOptionsTest extends AbstractOptionsTest {

    @Tested
    private CowboyServerCodegen clientCodegen;

    public CowboyServerOptionsTest() {
        super(new CowboyServerOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return clientCodegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        new Expectations(clientCodegen) {{
        }};
    }
}
