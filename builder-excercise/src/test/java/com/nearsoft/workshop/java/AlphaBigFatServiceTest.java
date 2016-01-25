package com.nearsoft.workshop.java;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AlphaBigFatServiceTest {

    @Test
    public void testDoWhateverWithBravoService() throws Exception {
        BravoService bravoService = mock(BravoService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(bravoService, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithBravoService();

        verify(bravoService, times(1)).doWhatever();

    }

    @Test
    public void testDoWhateverWithCharlieService() throws Exception {
        CharlieService charlieService = mock(CharlieService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, charlieService, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null, null);

        alphaBigFatService.doWhateverWithCharlieService();

        verify(charlieService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithDeltaService() throws Exception {
        DeltaService deltaService = mock(DeltaService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, deltaService, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithDeltaService();

        verify(deltaService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithEchoService() throws Exception {
        EchoService echoService = mock(EchoService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, echoService, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithEchoService();

        verify(echoService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithFoxtrotService() throws Exception {
        FoxtrotService foxtrotService = mock(FoxtrotService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, foxtrotService, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null, null);

        alphaBigFatService.doWhateverWithFoxtrotService();

        verify(foxtrotService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithGolfService() throws Exception {
        GolfService golfService = mock(GolfService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, golfService, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithGolfService();

        verify(golfService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithHotelService() throws Exception {
        HotelService hotelService = mock(HotelService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, hotelService,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithHotelService();

        verify(hotelService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithIndiaService() throws Exception {
        IndiaService indiaService = mock(IndiaService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null,
                indiaService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null, null);

        alphaBigFatService.doWhateverWithIndiaService();

        verify(indiaService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithJuliettService() throws Exception {
        JuliettService juliettService = mock(JuliettService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                juliettService, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null, null);

        alphaBigFatService.doWhateverWithJuliettService();

        verify(juliettService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithKiloService() throws Exception {
        KiloService kiloService = mock(KiloService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, kiloService, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithKiloService();

        verify(kiloService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithLimaService() throws Exception {
        LimaService limaService = mock(LimaService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, limaService, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithLimaService();

        verify(limaService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithMikeService() throws Exception {
        MikeService mikeService = mock(MikeService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, mikeService, null, null, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithMikeService();

        verify(mikeService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithNovemberService() throws Exception {
        NovemberService novemberService = mock(NovemberService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, novemberService, null, null, null, null, null, null, null, null, null, null,
                null, null);

        alphaBigFatService.doWhateverWithNovemberService();

        verify(novemberService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithOscarService() throws Exception {
        OscarService oscarService = mock(OscarService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, oscarService, null, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithOscarService();

        verify(oscarService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithPapaService() throws Exception {
        PapaService papaService = mock(PapaService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, papaService, null, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithPapaService();

        verify(papaService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithQuebecService() throws Exception {
        QuebecService quebecService = mock(QuebecService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, quebecService, null, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithQuebecService();

        verify(quebecService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithRomeoService() throws Exception {
        RomeoService romeoService = mock(RomeoService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, romeoService, null, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithRomeoService();

        verify(romeoService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithSierraService() throws Exception {
        SierraService sierraService = mock(SierraService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, sierraService, null, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithSierraService();

        verify(sierraService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithTangoService() throws Exception {
        TangoService tangoService = mock(TangoService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, tangoService, null, null, null, null, null,
                null);

        alphaBigFatService.doWhateverWithTangoService();

        verify(tangoService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithUniformService() throws Exception {
        UniformService uniformService = mock(UniformService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, uniformService, null, null, null,
                null, null);

        alphaBigFatService.doWhateverWithUniformService();

        verify(uniformService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithVictorService() throws Exception {
        VictorService victorService = mock(VictorService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, victorService, null, null, null,
                null);

        alphaBigFatService.doWhateverWithVictorService();

        verify(victorService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithWhiskeyService() throws Exception {
        WhiskeyService whiskeyService = mock(WhiskeyService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, whiskeyService, null,
                null, null);

        alphaBigFatService.doWhateverWithWhiskeyService();

        verify(whiskeyService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithXRayService() throws Exception {
        XRayService xRayService = mock(XRayService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, xRayService, null,
                null);

        alphaBigFatService.doWhateverWithXRayService();

        verify(xRayService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithYankeeService() throws Exception {
        YankeeService yankeeService = mock(YankeeService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yankeeService,
                null);

        alphaBigFatService.doWhateverWithYankeeService();

        verify(yankeeService, times(1)).doWhatever();
    }

    @Test
    public void testDoWhateverWithZuluService() throws Exception {
        ZuluService zuluService = mock(ZuluService.class);
        AlphaBigFatService alphaBigFatService = new AlphaBigFatService(null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                zuluService);

        alphaBigFatService.doWhateverWithZuluService();

        verify(zuluService, times(1)).doWhatever();
    }
}