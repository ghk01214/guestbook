package com.jadecross.guestbook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PostTest
{
    @Test
    void TestSetName()
    {
        Post post = new Post("TESTER", "2026-05-20 15:47:10", "Happy Wedding");
        post.setName("DevOps");
        assertEquals("DevOps", post.getName());
    }
}