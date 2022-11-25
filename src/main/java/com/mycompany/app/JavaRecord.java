package com.mycompany.app;

import java.util.List;

public record JavaRecord(int foo, String bar, List<ImmutableGeneratedClass> thisWillFailCompilation) {}
