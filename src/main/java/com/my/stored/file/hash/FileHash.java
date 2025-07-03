package com.my.stored.file.hash;

import com.my.stored.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
