package com.zjq.aiagent.rag;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoveAppDocumentLoaderTest {

    @Resource
    LoveAppDocumentLoader loveAppDocumentLoader;
    @Test
    void loadMarkDowns() {
        loveAppDocumentLoader.loadMarkDowns();
    }
}