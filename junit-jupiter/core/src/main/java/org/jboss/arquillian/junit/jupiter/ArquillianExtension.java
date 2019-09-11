package org.jboss.arquillian.junit.jupiter;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ArquillianExtension implements BeforeAllCallback, BeforeEachCallback, AfterEachCallback, AfterAllCallback {

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
    }
}
