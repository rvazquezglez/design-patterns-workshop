package com.nearsoft.workshop.builder;

import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ImmutableProductTest {

    @Test
    public void testBuilderDefaultValues() throws Exception {

        ImmutableProduct product = ImmutableProduct.builder().build();

        assertThat(product.getDescription(), isEmptyOrNullString());
        assertThat(product.getName(), isEmptyOrNullString());
        assertThat(product.getPrice(), is(0.0));
        assertThat(product.getSku(), isEmptyOrNullString());
    }

    @Test
    public void testBuilderNoDefaultValues() throws Exception {

        ImmutableProduct product = ImmutableProduct.builder() //
                .withName("Tonayan") //
                .withDescription("Este producto te dará super poderes") //
                .withPrice(10.50) //
                .withSku("1234ASDFQWERZXCV") //
                .build();

        assertThat(product.getDescription(), is("Este producto te dará super poderes"));
        assertThat(product.getName(), is("Tonayan"));
        assertThat(product.getPrice(), is(10.50));
        assertThat(product.getSku(), is("1234ASDFQWERZXCV"));
    }


}