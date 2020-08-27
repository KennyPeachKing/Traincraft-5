package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH120Commute;
import train.common.entity.rollingStock.*;

public enum EnumSounds {

	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, "heavy_whistle", 1F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoA4(EntityLocoSteamMallardA4.class, "a4_whistle", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41(EntityLocoSteamC41.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41080(EntityLocoSteamC41_080.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamfowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk765(EntityLocoSteamBerk765.class, "765_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk1225(EntityLocoSteamBerk1225.class, "pe_whistle", 0.6F, "pe_run", 0.4F, 20, "pe_idle", 0.4F, 20, true),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, "ebt_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100UK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "pe_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100US(EntityLocoSteamUSATCUS.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "southern_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41T(EntityLocoSteamC41T.class, "drgw_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamShay(EntityLocoSteamShay.class, "lukenhimer_3chime", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51S(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51L(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "drgw_3chime_2", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20,
			true),
	GS4(EntityLocoSteamGS4.class, "daylight_whistle", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	MILWClassA(EntityLocoSteamMILWClassA.class, "american_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoAlice(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20,
			true),
	locoGLYN(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20,
			true),
	locovb(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	locosvbShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	loco262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoClimax(EntityLocoSteamClimax.class, "crosby_3chime", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run",
			0.4F, 20, true),

	locoVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "nathan_k5La_2", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoTramWood(EntityLocoElectricTramWood.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	E10(EntityLocoElectricE10_DB.class, "k5la_4", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoBR185(EntityLocoElectricBR185.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),

	locoCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40,
			false),
	locoChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoBP4(EntityLocoElectricBP4.class, "nathan_k5La_3", 0.8F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoFOLM1(EntityLocoDieselFOLM1.class, "nathan_p01235", 2.0F, "38d_6_notch8", 0.65F, 40, "38d_6_idle", 0.65F, 40, false),
	locoKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false),
	locoSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoShunter(EntityLocoDieselShunter.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	loco44tonSwitcher(EntityLocoDiesel44TonSwitcher.class, "leslie_a200", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_run", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	MILW_H1044(EntityLocoDieselMILW_H1044.class, "eu07_horn", 0.8F, "vl10_idle", 0.65F, 40, "vl10_idle", 0.65F, 40, false),
	locoDeltic(EntityLocoDieselDeltic.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40,
			false),
	locoClass66(EntityLocoDieselClass66.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40,
			false),
	locoCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	E103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),

	driverlessMetro(PCH120Commute.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	alcoS2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselAlcoS2.class, "leslie_a200", 1F, "539t_notch8", 0.50F, 40, "539t_idle", 0.65F, 40, true),
	SW1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1.class, "leslie_a200", 0.9F, "567_notch8", 0.45F, 40, "567_idle", 0.75F, 40, false),
	H1044(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH1044.class, "wabco_e2", 10F, "38d_6_notch8", 0.65F, 40, "38d_6_idle", 0.65F, 40, false),
	Thanos(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, "thanos_horn", 5, "thanos_run", 0.65F, 60, "thanos_idle", 0.65F, 60, false),
	HighrailTruck(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class, "truck_horn", 0.8F, "boxcab_notch8", 0.65F, 15, "boxcab_idle", 0.65F, 25, true),
	U23B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23B.class, "leslie_s3l", 2.5F, "7fdl-12_notch8", 0.65F, 40, "7fdl-12_idle", 0.65F, 50, true),
	SW1500(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1500.class, "nathan_p3", 0.65F, "16-645e_notch8", 0.65F, 10, "16-645e_idle", 0.8F, 3, true),
	SD45dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, "leslie_rs5t", 2.5F, "645e3_notch8", 0.65F, 10, "645e3_idle", 0.65F, 3, true),
	SD40dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2.class, "leslie_rs3k", 2.5F, "16-645e_notch8", 0.65F, 10, "16-645e_idle", 0.8F, 5, true),
	CF7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7.class, "nathan_k3la", 0.65F, "567_notch8", 0.65F, 10, "567_idle", 0.8F, 3, true),
	SD9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, "nathan_k3la", 2.5F, "567_notch8", 0.45F, 10, "567_idle", 0.75F, 3, true),
	SF30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, "leslie_s3", 2F, "fdl16_notch8", 0.5F, 10, "fdl16_idle", 0.5F, 3, true),
	SDL39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, "nathan_p3", 2F, "645e3_notch8", 0.65F, 10, "645e3_idle", 0.65F, 3, true),
	geGenesis(com.jcirmodelsquad.tcjcir.vehicles.locomotives.GeGenesis.class, "nathan_k5La", 2.5F, "7fdl-12_notch8", 0.65F, 40, "7fdl-12_idle", 0.65F, 50, true),
	F7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7A.class, "leslie_a200", 1F, "567_notch8", 0.45F, 15, "567_idle", 0.75F, 3, true),
	F7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7B.class, "leslie_a200", 1F, "567_notch8", 0.45F, 15, "567_idle", 0.75F, 3, true),
	ES44(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44.class, "nathan_k5hll", 1F, "gevo12_notch8", 0.65F, 20, "gevo12_idle", 0.75F, 50, true),
	Boxcab23Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, "wabco_e2", 10F, "boxcab_notch8", 0.5F, 15, "boxcab_idle", 0.5F, 25, false),
	testControlCar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.TestControlCar.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	PCH100H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, "nathan_p2", 1F, "pch100h_notch8", 0.6F, 8, "pch100h_idle", 0.4F, 50, false),
	LU96Stock(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricLUengine.class, "lu_whistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	GP13(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP13.class, "nathan_p6", 0.8F, "chme3_run", 0.65F, 35, "chme3_idle", 0.65F, 40, false),
	FOLM1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFOLM1B.class, "nathan_p01235", 0.0F,"38d_6_notch8", 0.65F, 40, "38d_6_idle", 0.65F, 40, false),
	GP30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP30.class, "nathan_p5", 0.8F, "567_notch8", 0.65F, 35, "567_idle", 0.65F, 40, false),
	VBShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	Payload(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.BombCart.class, "", 0.8F, "bombcart_run", 1F, 60, "", 0.2F, 20, false),
	SD70M(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70Mac.class, "nathan_k5la_4", 0.8F, "710G3B_notch8", 1F, 40, "710G3B_idle", 0.2F, 20, false),
	;
	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
	 * 
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

	public Class getEntityClass() {
		return entityClass;
	}

	public String getHornString() {
		return horn;
	}

	public String getRunString() {
		return run;
	}

	public String getIdleString() {
		return idle;
	}

	public Float getHornVolume() {
		return hornVolume;
	}

	public Float getRunVolume() {
		return runVolume;
	}

	public Float getIdleVolume() {
		return idleVolume;
	}

	public int getRunSoundLenght() {
		return runSoundLenght;
	}

	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
