package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH120Commute;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.Class345Coach;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.PCH120Coach;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.*;

import java.lang.reflect.InvocationTargetException;

public enum EnumTrains {

	/**
	 * Passengers
	 */
	passengerCartBlue("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "Lime"}), 18, 0),
	passengerCartBlackSmall("Passenger Small Black", EntityPassenger2.class, ItemIDs.minecartPassenger2.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerLongGreen("Passenger Green Long", EntityPassenger5.class, ItemIDs.minecartPassenger5.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow"}), 18, 0),
	passengerShortGreen("Passenger Short Green", EntityPassenger7.class, ItemIDs.minecartPassenger7.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passenger_1class_DB("Passenger 1Class DB", EntityPassenger_1class_DB.class, ItemIDs.minecartPassenger8_1class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passenger_2class_DB("Passenger 2Class DB", EntityPassenger_2class_DB.class, ItemIDs.minecartPassenger9_2class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerHighSpeedZeroED("Passenger High Speed Zero ED", EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey", "Grey"}), 18, 0),
	passengerTramNY("Passenger Tram NY", EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerAdler("Passenger Adler", EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerDBOriental("Passenger DB oriental", EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "White", "LightBlue"}), 18, 0),
	passengerIC4_DSB_FG("Passenger IC4 DSB FG", PassengerIC4_DSB_FG.class, ItemIDs.minecartIC4_DSB_FG.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0, "Unfinished, Creative Only"),
	passengerIC4_DSB_FH("Passenger IC4 DSB FH", PassengerIC4_DSB_FH.class, ItemIDs.minecartIC4_DSB_FH.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0, "Unfinished, Creative Only"),
	passengerICE1_Class1("Passenger ICE 1st Class", EntityPassengerICE_1class.class, ItemIDs.minecartICE1_1stClass.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0),
	passengerICE1_Class2("Passenger ICE 2nd Class", EntityPassengerICE_2class.class, ItemIDs.minecartICE1_2ndClass.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0),
	passengerICE1_Restaurant("ICE Restaurant", EntityPassengerICE_Restaurant.class,
			ItemIDs.minecartICE1_Restaurant.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0),
	passengerGS4("Passenger GS4", EntityPassengerGS4.class, ItemIDs.minecartGS4_Passenger.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Green", "Lime", "Red", "Grey", "Green", "LightGrey", "Blue", "Black", "LightBlue"}), 10, 0),
	passengerGS4Observatory("Passenger GS4 Observatory", EntityPassengerGS4_Observatory.class, ItemIDs.minecartGS4_Observatory.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}), 10, 0),
	passengerGS4_Tail("Passenger GS4 Tail", EntityPassengerGS4_Tail.class, ItemIDs.minecartGS4_Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}), 10, 0),

	passengerDenverRioGrange("Passenger Denver Rio Grande", EntityPassengerDenverRioGrande.class, ItemIDs.minecartDenverRioGrandePassenger.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Green"}), 10, 0),
	passengerDenverRioGrandeCombo("Passenger Denver Rio Grande Combo", EntityPassengerDenverRioGrandeCombo.class, ItemIDs.minecartDenverRioGrandeCombo.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Green"}), 10, 0),

	passengerRheingold("Passenger Rheingold", EntityPassengerRheingold.class, ItemIDs.minecartPassengerRheingold.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"}), 18, 0),
	passengerRheingoldDining1("Rheingold Dining", EntityPassengerRheingoldDining1.class, ItemIDs.minecartPassengerRheingoldDining1.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"}), 18, 0),
	passengerRheingoldDining2("Rheingold Dining Alternate", EntityPassengerRheingoldDining2.class, ItemIDs.minecartPassengerRheingoldDining2.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"}), 18, 0),
	passengerRheingoldPanorama("Rheingold Panorama", EntityPassengerRheingoldPanorama.class, ItemIDs.minecartPassengerRheingoldPanorama.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red"}), 18, 0),

	passengerMILW("Passenger MILW", EntityPassengerMILW.class, ItemIDs.minecartPassengerMILW.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerMILWTail("Passenger MILW Tail", EntityPassengerMILWTail.class, ItemIDs.minecartPassengerMILWTail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	//passengerMILWDiner("Passenger MILW Diner",EntityPassengerMILWDiner.class, ItemIDs.minecartPassengerMILWDiner.item,"passenger",0,0,1,0,0,0,0,0,0,null,18,0),

	passengerBamboo("Bamboo Flatcar Passenger", EntityPassengerBamboo.class, ItemIDs.minecartPassengerBamboo.item, "passenger", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}), 18, 0),


	/**
	 * Caboose
	 */
	cabooseRed("Caboose Red", EntityCaboose.class, ItemIDs.minecartCaboose.item, "caboose", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	cabooseBlack("Caboose Black", EntityCaboose3.class, ItemIDs.minecartCaboose3.item, "caboose", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),

	/**
	 * Specials
	 **/
	GWRBrakeVan("GWR Toad Brake Van", EntityGWRBrakeVan.class, ItemIDs.minecartGWRBrakeVan.item, "work", 0, 0, 0.7, 0, 0, 0, 0, 0, 0, null, 18, 0),
	stockCar("Stock Cart", EntityStockCar.class, ItemIDs.minecartStockCar.item, "special", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Yellow", "White"}), 18, 0),
	drwgStockCar("DRWG Stock Cart", EntityStockCarDRWG.class, ItemIDs.minecartDRWGStockCar.item, "special", 0, 0, 2, 0, 0, 0, 0, 0, 0, null, 18, 0),
	workCart("Work Cart Yellow", EntityWorkCart.class, ItemIDs.minecartWork.item, "work", 0, 0, 0.7, 0, 0, 0, 0, 0, 0, null, 18, 0),
	flatCart("Flat Cart", EntityFlatCart.class, ItemIDs.minecartFlatCart.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0),
	workCaboose("Work Caboose", EntityCabooseWorkCart.class, ItemIDs.minecartCabooseWork.item, "work", 0, 0, 0.6, 0, 0, 0, 0, 0, 0, null, 18, 0),
	cabooseLogging("Caboose Logging", EntityCabooseLogging.class, ItemIDs.minecartCabooseLogging.item, "work", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Cyan", "Grey"}), 18, 0),
	cabooseLoggingPRR("PRR Caboose Logging", EntityCabooseLoggingPRR.class, ItemIDs.minecartCabooseLoggingPRR.item, "work", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Green", "Orange"}), 18, 0),
	mailWagen_DB("Mail Wagon DB", EntityMailWagen_DB.class, ItemIDs.minecartMailWagon_DB.item, "work", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	jukeBoxCart("JukeBox Cart", EntityJukeBoxCart.class, ItemIDs.minecartJukeBoxCart.item, "special", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0, "Supports MP3/OGG format M3U/PLS links, like Shoutcast"),
	flatCartSU("Flat Cart SU", EntityFlatCartSU.class, ItemIDs.minecartFlatCartSU.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0),
	flatCartUS("Flat Cart US", EntityFlatCartUS.class, ItemIDs.minecartFlatCartUS.item, "flat", 0, 0, 0.4, 0, 0, 0, 0, 0, 0, null, 18, 0),
	tracksBuilder("Tracks Builder", EntityTracksBuilder.class, ItemIDs.minecartBuilder.item, "special", 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 14, 0),
	flatCar_DB("Flat Cart DB", EntityFlatCar_DB.class, ItemIDs.minecartFlatCart_DB.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green"}), 18, 0),
	BUnitEMDF7("EMD F7 B Unit", EntityBUnitEMDF7.class, ItemIDs.minecartLocoEMDF7B.item, "b-unit", 0, 0, 5, 0,
			0,
			0, 0, 0, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Lime", "Red", "Brown", "Green", "Orange", "Yellow"}), 18, 0,
			"Reduces weight carried by 50 tons when fueled"),
	BUnitEMDF3("EMD F3 B Unit", EntityBUnitEMDF3.class, ItemIDs.minecartLocoEMDF3B.item, "b-unit", 0, 0, 5, 0,
			0,
			0, 0, 0, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Orange", "Blue", "Brown", "Green", "Magenta"}), 18, 0,
			"Reduces weight carried by 50 tons when fueled"),
	BUnitDD35("DD35 B Unit", EntityBUnitDD35.class, ItemIDs.minecartLocoDD35B.item, "b-unit", 0, 0, 8, 0, 0, 0, 0, 0,
			12000, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Black"}), 18, 0, "Reduces weight carried by 80 tons when fueled"),
	propagandaUs("Propaganda USA", EntityPropagandaUS.class, ItemIDs.minecartPropagandaUs.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Red"}), 14, 0),
	propagandaUSSR("Propaganda USSR", EntityPropagandaUSSR.class, ItemIDs.minecartPropagandaUSSR.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Red"}), 14, 0),
	propagandaJapan("Propaganda Japan", EntityPropagandaJapan.class, ItemIDs.minecartPropagandaJapan.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "White", "Yellow"}), 14, 0),
	propagandaBritain("Propaganda Britain", EntityPropagandaBritain.class, ItemIDs.minecartPropagandaBritish.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Yellow"}), 14, 0),

	/**
	 * Freight
	 */
	freightCartRed("Freight Cart Red", EntityFreightCart2.class, ItemIDs.minecartFreightCart2.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Red", "White"}), 18, 36,"Cargo: any"),
	freightCartYellow("Freight Cart Yellow", EntityFreightCart.class, ItemIDs.minecartChest.item, "freight", 3, null, 18, 36,"Cargo: any"),
	freightWood("Freight Flat Cart Log", EntityFreightWood.class, ItemIDs.minecartWood.item, "freight", 3, null, 18, 27, "Cargo: only Logs"),
	freightHopper("Freight Hopper Green", EntityFreightGrain.class, ItemIDs.minecartGrain.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Green", "White"}), 18, 36, "Cargo: wheat, seeds"),
	freightKClassRailBox("Freight K Class Rail Box", EntityFreightKClassRailBox.class, ItemIDs.minecartKClassRailBox.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange"}), 18, 36,"Fictional. Cargo: any"),
	freightShortCoveredHopper("Freight Short Covered Hopper", EntityFreightShortCoveredHopper.class, ItemIDs.minecartShortCoveredHopper.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Orange", "LightBlue", "Lime", "Yellow", "Blue"}), 18, 36,"Cargo: any"),
	freightLongCoveredHopper("Freight Long Covered Hopper", EntityFreightLongCoveredHopper.class, ItemIDs.minecartLongCoveredHopper.item, "freight", 6, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey", "Grey","Pink", "White", "Green", "Orange", "Lime"}), 18, 54,"Cargo: any"),
	freightOpenWagon("Freight Open Wagon", EntityFreightOpenWagon.class, ItemIDs.minecartOpenWagon.item, "freight", 2, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Brown"}), 18, 36, "Cargo: blocks, vanilla items"),//"train_hopper" for open wagon => weird
	freightHopperUS("Freight Hopper US", EntityFreightHopperUS.class, ItemIDs.minecartFreightHopperUS.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Grey", "LightGrey", "Blue", "Red", "Yellow", "Black", "LightBlue", "Purple", "Green", "Magenta", "Orange"}), 18, 27, "Cargo: blocks"),
	freight100TonHopper("Freight 100 Ton Hopper", EntityFreight100TonHopper.class, ItemIDs.minecartFreight100TonHopper.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Black", "Blue", "Grey", "LightGrey", "Brown"}), 18, 54, "Cargo: blocks"),
	flatCartWoodUS("Freight Flat Cart Wood US", EntityFlatCartWoodUS.class, ItemIDs.minecartFlatCartWoodUS.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Red", "White"}), 18, 27, "Cargo: wood stuff"),
	bulkheadFlatCartWood("Freight Bulkhead Flat Cart", EntityBulkheadFlatCart.class, ItemIDs.minecartBulkheadFlatCart.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Yellow", "Green"}), 18, 27, "Cargo: only planks"),
	freightCartUS("Freight Cart US", EntityFreightCartUS.class, ItemIDs.minecartFreightCartUS.item, "freight", 3.5, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Yellow", "Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White"}), 18, 36,"Cargo: blocks, vanilla items"),
	freightBoxCartUS("Freight Box Cart US", EntityBoxCartUS.class, ItemIDs.minecartBoxCartUS.item, "freight", 2, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Purple", "Orange", "Grey"}), 18, 45,"Cargo: any"),
	freightBoxCartPRR("Freight Box Cart PRR", EntityBoxCartPRR.class, ItemIDs.minecartBoxCartPRR.item, "freight", 2, null, 18, 45,"Cargo: any"),
	freightCartSmall("Freight Cart Small", EntityFreightCartSmall.class, ItemIDs.minecartFreightCartSmall.item, "freight", 1, null, 18, 36,"Cargo: any"),
	freightMinetrain("Freight Minecart Yellow", EntityFreightMinetrain.class, ItemIDs.minecartMineTrain.item, "freight", 0.5, null, 18, 18, "Cargo: opaque blocks"),
	freightGTNG("Freight GTNG Ore Wagon", EntityFreightGTNG.class, ItemIDs.minecartFreightGTNG.item, "freight", 0.5, null, 18, 18,"Cargo: opaque blocks"),
	flatCartWoodLogs("Freight Flat Logs", EntityFreightWood2.class, ItemIDs.minecartFreightWood2.item, "freight", 3, null, 18, 18, "Cargo: only logs"),
	freightClosedRedBrown("Freight Cart Closed RedBrown", EntityFreightClosed.class, ItemIDs.minecartFreightClosed.item, "freight", 2.5, null, 18, 36,"Cargo: any"),
	freightOpenRedBrown("Freight Open RedBrown", EntityFreightOpen2.class, ItemIDs.minecartFreightOpen2.item, "freight", 5, null, 18, 21,"Cargo: any"),
	freightWagen_DB("Freight Wagon DB", EntityFreightWagenDB.class, ItemIDs.minecartFreightWagon_DB.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green", "Yellow"}), 18, 54,"Cargo: any"),
	flatCarRails_DB("Freight Flat Cart Rails DB", EntityFlatCarRails_DB.class, ItemIDs.minecartFlatCartRail_DB.item, "freight", 5, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green"}), 18, 36, "Cargo: only rails"),
	ASTFAutorack("Freight ASTF Autorack", EntityFreightASTFAutorack.class, ItemIDs.minecartASTFAutorack.item, "freight", 5, null, 18, 36, "Cargo: any | Stack limit 1"),
	flatCarLogs_DB("Freight Flat Cart Logs DB", EntityFlatCarLogs_DB.class, ItemIDs.minecartFlatCartLogs_DB.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green"}), 18, 45, "Cargo: only logs"),
	slateWagon("Freight Slate Wagon", EntityFreightSlateWagon.class, ItemIDs.minecartSlateWagon.item, "freight",
			0.5, null, 18, 38, "Cargo: only stone and ores"),
	iceWagon("Freight Ice Wagon", EntityFreightIceWagon.class, ItemIDs.minecartIceWagon.item, "freight",
			0.5, null, 18, 38, "Cargo: only ice"),
	freightCartGS4("Freight Cart GS4 Baggage", EntityFreightGS4_Baggage.class, ItemIDs.minecartGS4_Baggage.item, "freight", 1, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}), 18, 45,"Cargo: any"),
	freightGondola_DB("Freight Gondola DB", EntityFreightGondola_DB.class, ItemIDs.minecartFreightGondola_DB.item, "freight", 3.5, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green"}), 18, 45, "Cargo: blocks, vanilla items"),
	freightCenterBeam_Empty("Freight Center Beam Empty", EntityFreightCenterbeam_Empty.class, ItemIDs.minecartFreightCenterBeam_Empty.item, "freight", 0.5, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey"}), 18, 54,"Cargo: any"),
	freightCenterBeam_Wood1("Freight Center Beam Wood1", EntityFreightCenterbeam_Wood_1.class, ItemIDs.minecartFreightCenterBeam_Wood_1.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Blue", "White"}), 18, 54, "Cargo: wood stuff"),
	freightCenterBeam_Wood2("Freight Center Beam Wood2", EntityFreightCenterbeam_Wood_2.class, ItemIDs.minecartFreightCenterBeam_Wood_2.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Yellow", "White"}), 18, 54, "Cargo: wood stuff"),
	//freightWellcar("Freight Well Car",EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item,"freight",3,new String[] {"Blue","Red","Green","LightGrey","Grey", "Yellow"},18,54,new String[] {"Cargo: any"}),
	freightWellcar("Freight Well Car", EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "Black", "Grey", "Cyan", "Brown", "Lime", "LightBlue", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"}), 18, 54,"Cargo: any"),
	freightTrailer("Freight Trailer", EntityFreightTrailer.class, ItemIDs.minecartFreightTrailer.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "LightBlue", "Red", "Grey", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "Lime", "White", "Green"}), 18, 54,"Cargo: any"),
	freightDenverRioGrange("Denver Rio Grande Baggage", EntityFreightDenverRioGrande.class, ItemIDs.minecartDenverRioGrandeBaggage.item, "freight", 0.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Green"}), 18, 54,"Cargo: any"),
	freightMILWBaggage("MILW Baggage", EntityFreightBaggageMILW.class, ItemIDs.minecartBaggageMILW.item, "freight", 0.5, null, 18, 54,"Cargo: any"),
	freightheavyweight("Heavyweight Freight Car", EntityFreightHeavyweight.class, ItemIDs.minecartHeavyweightMailcar.item, "freight", 0.5, null, 18, 27,"Cargo: any"),
	freightCartBamboo("Bamboo Flatcar Freight", EntityFreightBamboo.class, ItemIDs.minecartFreightBamboo.item, "freight", 0.1, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}), 18, 36,"Cargo: any"),
	freightGermanPost("Freight German Post", EntityFreightGermanPost.class, ItemIDs.minecartFreightGermanPost.item, "freight", 0.1, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Blue"}), 18, 36, "Cargo: non-blocks"),
	freightDepressedFlatbed("Freight Depressed Flatcar", EntityFreightDepressedFlatbed.class, ItemIDs.minecartFreightDepressedFlatbed.item, "freight", 0.1, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Blue", "Yellow"}), 18, 36,"Cargo: any"),
	freightCarL("Freight Car L", EntityFreightCartL.class, ItemIDs.minecartFreightL.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue"}), 18, 27,"Cargo: any"),
	freightHeavyweight("Freight Heavyweight Baggage", EntityFreightHeavyweightBaggage.class, ItemIDs.minecartHeavyweightFreight.item, "freight", 3, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Grey"}), 18, 36,"Cargo: any"),

	/**
	 * Tanks
	 **/
	tankWagon_DB("Tank Wagon DB", EntityTankWagon_DB.class, ItemIDs.minecartTankWagon_DB.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 50000, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Green"}), 18, 0, "Capacity: 50000mb"),
	tankThreeDome("Tank Wagon Three Dome", EntityTankWagonThreeDome.class, ItemIDs.minecartTankWagonThreeDome.item, "tank", 0, 0, 7.5, 0, 0, 0, 0, 0, 90000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "White"}), 18, 0, "Capacity: 90000mb"),
	tankWagonUS("Tank Wagon US", EntityTankWagonUS.class, ItemIDs.minecartTankWagonUS.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 70000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "Yellow", "White", "LightGrey", "Green", "Blue", "Lime", "Orange", "Cyan", "Pink", "Purple", "LightBlue", "Magenta"}), 18, 0, "Capacity: 70000mb"),
	tankWagonGrey("Tank Wagon Grey", EntityTankWagon2.class, ItemIDs.minecartTankWagon2.item, "tank", 0, 0, 3, 0, 0, 0, 0, 0, 40000, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Orange"}), 18, 0, "Capacity: 40000mb"),
	tankCartLava("Tank Lava", EntityTankLava.class, ItemIDs.minecartWatertransp.item, "tank", 0, 0, 5, 0, 0, 0, 0, 0, 30000, TraincraftUtil.getBytesFromColors(new String[]{"Empty", "Full"}), 18, 0, "Lava Capacity: 30000mb"),
	tankWagonYellow("Tank Wagon Yellow", EntityTankWagon.class, ItemIDs.minecartTankWagon.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 40000, null, 18, 0, "Capacity: 40000mb"),

	/**
	 * Tenders
	 */
	tenderSmall("Tender Small Black", EntityTenderSmall.class, ItemIDs.minecartTender.item, "tender", 0, 0, 0.1, 0, 0, 0, 0, 0, 5000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Blue", "Green", "Yellow"}), 18, 0, "Water capacity: 5000mb"),
	tenderHeavy("Tender Heavy", EntityTenderHeavy.class,
			ItemIDs.minecartTenderHeavy.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 14000, null, 18, 0,
			"Water capacity: 14000mb"),
	tenderGS4("Tender GS4", EntityTenderGS4.class, ItemIDs.minecartGS4_Tender.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Black"}), 18, 0, "Water capacity: 18000mb"),
	Model4000GallonTender("4000GallonTender",EntityTender4000.class, ItemIDs.minecart4000GallonTender.item,"tender",0,0,2,0,0,0,0,0,15000,TraincraftUtil.getBytesFromColors(new String[]{"Green", "Blue", "Red", "Lime"}),18,0,"Water capacity: 15000mb"),
	ModelFowler4FTender("Fowler 4F Tender",EntityTenderFowler4F.class, ItemIDs.minecartFowler4FTender.item,"tender",0,0,2,0,0,0,0,0,15000, null, 18,0,"Water capacity: 15000mb"),
	Model225Tender("1225 tender",EntityTenderBerk1225.class, ItemIDs.minecarttenderBerk1225.item,"tender",0,0,2,0,0,0,0,0,15000,TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey"}),18,0,"Water capacity: 15000mb"),
	tender4_4_0("Tender 4-4-0", EntityTender4_4_0.class,  ItemIDs.minecartSteamRedTender.item, "tender", 0, 0, 0.2,
			0, 0, 0, 0, 0, 8000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "White", "Brown", "Blue", "Green", "Red", "Purple" }), 18, 0,
			"Water capacity: 8000mb" ),
	tenderA4("Tender A4 Mallard", EntityTenderA4.class,  ItemIDs.minecartLocoA4MallardTender.item,"tender", 0, 0, 0.2, 0, 0, 0, 0, 0, 6000, TraincraftUtil.getBytesFromColors(new String[] { "Blue", "Lime", "Black", "Green", "White" }), 18,0, "Water capacity: 6000mb"),
	tenderBR01("Tender BR01",EntityTenderBR01_DB.class, ItemIDs.minecartTenderBR01_DB.item,"tender",0,0,0.5,0,0,0,0,0,20000,null,18,0,"Water capacity: 20000mb"),
	tenderCoranationClass("Tender Coranation Class",EntityTenderCoranationClass.class,ItemIDs.minecartLocoCoranationClassTender.item,"tender",0,0,0.5,0,0,0,0,0,20000,null,18,0,"Water capacity: 20000mb"),
	tenderEr_Ussr("Tender ER_USSR",EntityTenderEr_Ussr.class, ItemIDs.minecartTenderEr.item,"tender",0,0,2,0,0,0,0,0,16000,null,18,0,"Water capacity: 16000mb"),
	tenderC62Class("Tender C62Class", EntityTenderC62Class.class, ItemIDs.minecartTenderC62Class.item, "tender", 0,
			0, 0.5, 0, 0, 0, 0, 0, 14000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Red" }), 18, 0,
			"Water capacity: 14000mb" ),
	tenderD51("Tender D51", EntityTenderD51.class, ItemIDs.minecartTenderD51.item, "tender", 0,
			0, 0.5, 0, 0, 0, 0, 0, 14000, null, 18, 0,
			"Water capacity: 12000mb" ),
	tenderAdler("Tender Adler",EntityTenderAdler.class, ItemIDs.minecartTenderAdler.item,"tender",0,0,0.5,0,0,0,0,0,4000,null,18,0,"Water capacity: 4000mb"),
	tender_C41("Tender C41",EntityTender_C41.class, ItemIDs.minecartTenderC41.item,"tender",0,0,1.5,0,0,0,0,0,16000,null,18,0,"Water capacity: 16000mb"),
	tender_Southern1102("Tender Southern1102",EntityTender_Southern1102.class, ItemIDs.minecartTenderSouthern1102.item,"tender",0,0,1.5,0,0,0,0,0,16000,null,18,0,"Water capacity: 16000mb"),
	tender_MILW("Tender MILW",EntityTenderMILW.class, ItemIDs.minecartMILWTender.item,"tender",0,0,1.5,0,0,0,0,0,16000,null,18,0,"Water capacity: 16000mb"),

	/** Diesel */
	locoDieselKOF("Loco Diesel KOF DB",EntityLocoDieselKof_DB.class,ItemIDs.minecartKof_DB.item, "diesel",750,45,0,60,0,170,0.66,0.96,5000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Green","Yellow","Black","Blue"}),17,-1.6),
	locoDieselGP40("Loco Diesel CD742", EntityLocoDieselCD742.class,  ItemIDs.minecartCD742.item, "diesel", 1727, 70,
			0, 50, 0, 250, 0.8, 0.966, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Yellow", "White", "Blue", "Orange", "LightBlue" }), 15, -2.5),
	locoDieselChME3("Loco Diesel ChME3", EntityLocoDieselChME3.class,  ItemIDs.minecartChmE3.item,"diesel", 2383, 95, 0, 60, 0, 170, 0.66, 0.96, 5000, null, 15,  -1.2),
	locoDieselGP7Red("Loco Diesel GP7",EntityLocoDieselGP7Red.class, ItemIDs.minecartGP7Red.item,"diesel",2464,105,0,50,0,200,0.74,0.96,20000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Blue","Black","Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}),15,-1.4),
	locoDieselSD40("Loco Diesel SD40",EntityLocoDieselSD40.class, ItemIDs.minecartLocoSD40.item,"diesel",3041,105,0,60,0,200,0.8,0.97,20000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Yellow","Black","Green","Orange","Magenta","Blue"}),10,-2.3),
	locoDieselSD70("Loco Diesel SD70",EntityLocoDieselSD70.class, ItemIDs.minecartLocoSD70.item,"diesel",4055,120,0,60,0,200,0.8,0.97,20000,TraincraftUtil.getBytesFromColors(new String[] {"Orange","Yellow","Red","Blue","Magenta","Black", "Pink", "Green"}),10,-2.3),
	locoDieselShunter("Loco Diesel Shunter", EntityLocoDieselShunter.class,  ItemIDs.minecartShunter.item,"diesel", 354, 32, 0, 70, 0, 260, 0.6, 0.94, 8000,TraincraftUtil.getBytesFromColors(new String[] { "Blue", "Green", "Red", "Black" }), 14,  -2.58),
	locoDieselV60_DB("Loco Diesel V60 DB",EntityLocoDieselV60_DB.class, ItemIDs.minecartV60_DB.item,"diesel",1058,60,0,60,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Green","Yellow","Cyan"}),15,-1.5),
	locoDieselIC4_DSB_MG("Loco Diesel IC4 DSB MG",EntityLocoDieselIC4_DSB_MG.class, ItemIDs.minecartIC4_DSB_MG.item,"diesel",760,200,0,60,0,200,0.8,0.97,20000,TraincraftUtil.getBytesFromColors(new String[] {"White","Red"}),10,-6, "Unfinished, Creative Only"),
	locoDieselMILW_H1044("Loco Diesel MILW H10-44",EntityLocoDieselMILW_H1044.class,ItemIDs.minecartMILW_H1044.item,"diesel",1618,97,0,60,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Yellow", "Black", "Red", "Blue", "Grey", "LightBlue", "Green"}),15,-4.4),
	locoDieselEMDF7("Loco Diesel EMD F-7", EntityLocoDieselEMDF7.class, ItemIDs.minecartLocoEMDF7.item, "diesel",
			1600, 150, 0, 50, 0, 200, 0.8, 0.97, 12000,TraincraftUtil.getBytesFromColors(new String[]{"Black", "Lime", "Red", "Brown", "Green", "Orange", "Yellow"}), 10, -2.4),
	locoDieselEMDF3("Loco Diesel EMD F-3", EntityLocoDieselEMDF3.class, ItemIDs.minecartLocoEMDF3.item, "diesel",
			1500, 166, 0, 55, 0, 200, 0.8, 0.97, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Orange", "Blue", "Brown", "Green", "Magenta"}), 10, -2.25),
	locoDieselEWSClass66("Loco Electric EWS Class 66", EntityLocoDieselClass66.class,
			ItemIDs.minecartLocoEWSClass66.item, "diesel", 3678, 121, 0, 10, 0, 170, 0.7, 0.965, 6400,
			TraincraftUtil.getBytesFromColors(new String[] { "Pink", "Green", "Red"}), 18, -5.5),
	locoDieselDeltic("Loco Diesel Deltic", EntityLocoDieselDeltic.class, ItemIDs.minecartLocoDeltic.item, "diesel",
			1997, 161, 0, 10, 0, 170, 0.7, 0.965, 6400, null, 18, -4.8),
	locoDieselDD35A("Loco Diesel DD35A", EntityLocoDieselDD35A.class, ItemIDs.minecartLocoDD35A.item, "diesel", 5070, 145, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Black"}), 18, -4.75),
	locoDiesel44TonSwitcher("GE 44-ton Diesel switcher", EntityLocoDiesel44TonSwitcher.class, ItemIDs.minecartLoco44TonSwitcher.item, "diesel", 400, 56, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Cyan"}), 18, -2.75),
	locoDieselBamboo("Bamboo Flatcar Engine", EntityLocoDieselBamboo.class, ItemIDs.minecartTrainBamboo.item, "diesel", 30, 20, 0, 10, 0, 170, 0.7, 0.965, 3000,  TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}), 18, -2),
	locoDieselWLs40("Loco WLs40", EntityLocoDieselWLs40.class, ItemIDs.minecartLocoWLs40.item, "diesel", 60, 17, 0, 10, 0, 170, 0.7, 0.965, 3000, null, 18, -3),
	locoDieselFOL_M1("Loco FOL-M1", EntityLocoDieselFOLM1.class, ItemIDs.minecartLocoFOLM1.item, "diesel", 5000, 110, 0, 10, 0, 170, 0.7, 0.965, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue", "Black"}), 18, -3.9, "Fictional loco from Factorio"),



	/** Electric */
	locoElectricVL10("Loco Electric VL10", EntityLocoElectricVL10.class,  ItemIDs.minecartVL10.item, "electric", 6250, 100, 0, 8, 0, 400, 1.1, 0.956, 0, null, 14, -2.3),
	locoElectricBR_E69("Loco Electric BR_E69",EntityLocoElectricBR_E69.class, ItemIDs.minecartBR_E69.item,"electric",400,50,0,5,0,400,0.9,0.946,0,TraincraftUtil.getBytesFromColors(new String[] {"Green","Red","Black","Grey"}),18,0),
	locoElectricMineTrain("Loco Electric Minetrain",EntityLocoElectricMinetrain.class,ItemIDs.minecartLocoMineTrain.item,"electric",500,40,0,80,0,160,0.5,0.97,0,null,18,-1.2),
	locoElectricSpeedZeroED("Loco Electric High Speed ZeroED", EntityLocoElectricHighSpeedZeroED.class, ItemIDs.minecartLocoHighSpeedZeroED.item, "electric", 700, 240, 0, 3, 0,230, 1.4, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[] {"White","LightGrey", "Grey"}), 13,  -3.4),
	locoElectricICE1("Loco Electric ICE 1", EntityLocoElectricICE1.class, ItemIDs.minecartICE1_Loco.item,
			"electric", 1400, 280, 0, 4, 0, 250, 1.5, 0.98, 0, null, 13, -5),
	//locoSpeedGrey("Loco High Speed",EntityLocoElectricNewHighSpeedLoco.class, null,null),
	locoElectricTramYellow("Loco Electric Yellow Wood Tram",EntityLocoElectricTramWood.class, ItemIDs.minecartTramWood.item,"electric",300,55,0,10,0,140,0.5,0.965,0,null,14,-2),
	locoElectricTramNY("Loco Electric Tram NY", EntityLocoElectricTramNY.class,  ItemIDs.minecartNYTram.item,
			"electric", 1327, 89, 0, 10, 0, 170, 0.7, 0.965, 0, null, 18, -3),
	locoElectricBR185("Loco Electric BR 185", EntityLocoElectricBR185.class, ItemIDs.minecartLocoBR185.item,
			"electric", 2428, 160, 0, 6, 0, 170, 0.7, 0.965, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Magenta", "Cyan", "Grey", "LightBlue", "LightGrey", "Orange", "Pink", "Purple", "White", "Yellow", "Black", "Brown"}), 18, -5),
	locoDieselE10lDB("Loco Electric E10 DB",EntityLocoElectricE10_DB.class, ItemIDs.minecartE10_DB.item,"electric",2473,150,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Blue","Red", "Grey", "Brown", "Green","LightGrey", "Pink", "Purple", "White",}),15,-3.8),
	locoDieselE103("Loco Electric E103",EntityLocoElectricE103.class, ItemIDs.minecartE103.item,"electric",2806,200,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Blue"}),15,-3.6),
	locoElectricClass85("Loco Electric Class 85", EntityLocoElectricClass85.class,
			ItemIDs.minecartLocoClass85.item, "electric", 1997, 160, 0, 10, 0, 170, 0.7, 0.965, 0, null, 18, -5),
	locoElectricCD151("Loco Electric CD151", EntityLocoElectricCD151.class, ItemIDs.minecartLocoCD151.item,
			"electric", 1133, 150, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Red"}), 18, -4),
	locoElectricBP4("Loco Electric BP4",EntityLocoElectricBP4.class, ItemIDs.minecartLocoBP4.item,"electric",1520,105,0,60,0,200,0.8,0.97,8650,TraincraftUtil.getBytesFromColors(new String[]{"Green", "Purple", "Cyan"}),10,-4.25),

	/** Steam */
	locoSteamA4("Loco Steam A4 Mallard", EntityLocoSteamMallardA4.class,  ItemIDs.minecartLocoA4Mallard.item, "steam", 1418, 203, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Blue", "Lime", "Black", "Green", "White" }), 7, -5 ),
	locosteamHallClass("Loco Hall Class", EntityLocoSteamHallClass.class,  ItemIDs.minecartLocoHallClass.item, "steam", 1091, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Green", "Red", "Lime" }), 7, -4.95 ),
	locosteamBerk1225("Loco Berkshire 1225", EntityLocoSteamBerk1225.class,  ItemIDs.minecartLocoBerk1225.item, "steam", 2775, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String [] { "Black", "LightGrey" }), 7, -4.25 ),
	locosteamBerk765("Loco Berkshire 765", EntityLocoSteamBerk765.class,  ItemIDs.minecartLocoBerk765.item, "steam", 2563, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, null, 7, -4.25 ),
	locosteamFowler("Loco Fowler", EntityLocoSteamFowler.class,  ItemIDs.minecartLocoFowler.item, "steam", 980, 102, 0, 60, 200, 160, 0.65, 0.97, 10000, null, 7, -3.25 ),
	locosteamKingClass("Loco King Class", EntityLocoSteamKingClass.class,  ItemIDs.minecartLocoKingClass.item, "steam", 1613, 174, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Green", "Blue", "Lime" }), 7, -5.35 ),
	locoSteamMILW("Loco Steam MILW Class A", EntityLocoSteamMILWClassA.class,  ItemIDs.minecartLocoMILWClassA.item, "steam", 1228, 193, 0, 60, 150, 160, 0.65, 0.97, 10000, null, 7, -4.5 ),
	locoSteamCherepanov("Loco Steam Cherepanov",EntityLocoSteamCherepanov.class, ItemIDs.minecartLocoCherepanov.item,"steam",60,30,0,40,120,120,0.3D,0.98D,3000,null,18,-1.7),
	locoSteamBR80("Loco Steam BR80",EntityLocoSteamBR80_DB.class,ItemIDs.minecartLocoBR80_DB.item,"steam",575,45,0,100,130,135,0.45,0.97,7000,TraincraftUtil.getBytesFromColors(new String [] {"Black", "Green"}),16,-1.1),
	locoSteam4_4_0("Loco Steam 4-4-0",EntityLocoSteam4_4_0.class, ItemIDs.minecartPower.item,"steam",400,50,0,40,160,190,0.65,0.95,5000,TraincraftUtil.getBytesFromColors(new String[] {"Red","White","Blue","Brown","Green","Black", "Purple"}),16,-2),
	locoSteamSmall("Loco Steam Small",EntityLocoSteamSmall.class,  ItemIDs.minecartLoco3.item, "steam",250,45,0,140,140,160,0.5D,0.968D,5000,TraincraftUtil.getBytesFromColors(new String[] {"Blue","Red","Green","Yellow","Black"}),18,-1.7),
	locoSteamLSSP7("Loco Steam LSSP7",EntityLocoSteamLSSP7.class,  ItemIDs.minecartLocoLSSP7.item, "steam",250,45,0,140,140,160,0.5D,0.968D,5000,null,18,-1.1),
	locoHeavySteam("Loco Steam Heavy",EntityLocoSteamHeavy.class, ItemIDs.minecartHeavySteam.item,"steam",3000, 65, 0, 40, 140, 190,0.4D, 0.9D, 10000, null, 7, -3, "Back from the Grave!"),//SIKE ITS BACK
	locoSteamC62Class("Loco Steam C62Class", EntityLocoSteamC62Class.class,  ItemIDs.minecartLocoC62Class.item,
			"steam", 1223, 129, 0, 60, 180, 160, 0.7, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Red" }), 7, -5.66),
	locoSteamD51Short("Loco Steam D51 Short Streamlining", EntityLocoSteamD51.class,  ItemIDs.minecartLocoD51Short.item,
			"steam", 1658, 85, 0, 60, 180, 160, 0.7, 0.97, 10000,  TraincraftUtil.getBytesFromColors(new String[] { "Black", "Grey" }), 7, -5.66),
	locoSteamD51Long("Loco Steam D51 Long Streamlining", EntityLocoSteamD51Long.class,  ItemIDs.minecartLocoD51Long.item,
			"steam", 1658, 85, 0, 60, 180, 160, 0.7, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Grey" }), 7, -5.66),
	locoSteamBR01_DB("Loco Steam BR01", EntityLocoSteamBR01_DB.class, ItemIDs.minecartLocoBR01_DB.item,"steam", 2120, 130, 0, 60, 200, 300, 0.6, 0.97, 10000, null, 10,  -3.7),
	locoSteamCoranationClass("Loco Steam Coranation Class", EntityLocoSteamCoranationClass.class,
			ItemIDs.minecartLocoCoranationClass.item, "steam", 1619, 183, 0, 60, 200, 300, 0.6, 0.97, 10000, null, 10,
			-6),
	locoSteamGS4("Loco Steam GS4", EntityLocoSteamGS4.class,  ItemIDs.minecartGS4_Loco.item, "steam", 2653, 180, 0, 60, 350, 450, 0.6, 0.95, 8800, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Black"}), 10, -6 ),
	locoSteamEr_USSR("Loco Steam ER_USSR", EntityLocoSteamEr_Ussr.class, ItemIDs.minecartLocoEr.item,"steam", 800, 80, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -3.7 ),
	locoSteamC41("Loco Steam C41", EntityLocoSteamC41.class, ItemIDs.minecartLocoC41.item,"steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4 ),
	locoSteamC41_080("Loco Steam C41 0-8-0", EntityLocoSteamC41_080.class, ItemIDs.minecartLocoC41_080.item,"steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4 ),
	locoSteamAlcoSc4("Loco Steam Alco SC4", EntityLocoSteamAlcoSC4.class, ItemIDs.minecartLocoAlcoSC4.item,"steam", 800, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4 ),
	locoSteamSouthern1102("Loco Steam Southern 1102", EntityLocoSteamSouthern1102.class, ItemIDs.minecartLocoSouthern1102.item,"steam", 1236, 118, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -3.4 ),
	locoSteamUSATCUS("Loco Steam USATCUS", EntityLocoSteamUSATCUS.class, ItemIDs.minecartLocoUSATCUS.item,"steam", 197, 75, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -2.5 ),
	locoSteamUSATCUK("Loco Steam USATCUK", EntityLocoSteamUSATCUK.class, ItemIDs.minecartLocoUSATCUK.item,"steam", 197, 75, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -2.5 ),
	locoSteamC41T("Loco Steam C41T", EntityLocoSteamC41T.class, ItemIDs.minecartLocoC41T.item,"steam", 1484, 110, 0, 80, 100, 200, 0.35, 0.975, 16000, null, 10, -3.4 ),
	locoSteamForney("Loco Steam Forney",EntityLocoSteamForneyRed.class, ItemIDs.minecartLocoForneyRed.item,"steam",600,70,0,60,160,130,0.44,0.968,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Grey","Yellow","Brown","Blue","Green"}),15,-1.8),
	locoSteamMogul("Loco Steam Mogul",EntityLocoSteamMogulBlue.class, ItemIDs.minecartLocomogulBlue.item,"steam",500,65,0,50,180,180,0.56,0.967,5000,TraincraftUtil.getBytesFromColors(new String[] {"Blue","Black","Brown","Green","Red","White"}),15,-2.2),
	locoSteamShay("Loco Steam Shay",EntityLocoSteamShay.class, ItemIDs.minecartLocoSteamShay.item,"steam",250,50,0,50,160,130,0.5,0.968,4000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black"}),15,-1.3),
	locoSteamVBShay("Loco Steam VB Shay",EntityLocoSteamVBShay.class, ItemIDs.minecartLocoSteamVBShay.item,"steam",250,32,0,40,140,100,0.5,0.968,3000,null,15,-3.5),
	locoSteamClimax("Loco Steam Climax",EntityLocoSteamClimax.class, ItemIDs.minecartLocoSteamClimax.item,"steam",250,45,0,50,160,130,0.5,0.968,4000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey"}),15,-1.5),
	locoSteamPannier("Loco Steam Pannier",EntityLocoSteamPannier.class, ItemIDs.minecartLocoSteamPannier.item,"steam",903,80,0,50,160,130,0.5,0.968,8000,null,15,-3.5),
	locoSteamAlice("Loco Steam Alice",EntityLocoSteamAlice0_4_0.class, ItemIDs.minecartLocoSteamAlice.item,"steam",200,32,0,60,160,200,0.5,0.968,3750,null,15,-2),
	locoSteamGLYN("Loco Steam glyn",EntityLocoSteamGLYN042T.class, ItemIDs.minecartLocoSteamGLYN.item,"steam",600,32,0,60,160,200,0.45,0.968,3750,null,15,-2.5),
	locoSteam262T("Loco Steam 262T",EntityLocoSteam262T.class, ItemIDs.minecartLocoSteam262T.item,"steam",300,70,0,60,160,300,0.5,0.968,4250,null,15,-3),
	locoSteam040VB("Loco Steam 040VB",EntityLocoSteam040VB.class, ItemIDs.minecartLocoSteam040vb.item,"steam",200,32,0,40,120,200,0.5,0.968,2500,null,15,-1.1),
	locoSteamAdler("Loco Steam Adler",EntityLocoSteamAdler.class, ItemIDs.minecartLocoSteamAdler.item,"steam",200,65,0,60,160,300,0.5,0.968,3000,null,15,-1.5),
	locoSteamSnowPlow("Loco Steam Snow Plow", EntityLocoSteamSnowPlow.class, ItemIDs.minecartLocoSnowPlow.item, "steam, snow plow", 200, 20, 0, 10, 120, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[] {"Red", "LightBlue"}), 18, -4.75),

	/** JCIR-TC*/
	locoAlcoS2("Alco S2",  com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselAlcoS2.class, ItemIDs.minecartAlcoS2.item, "diesel", 1000, 96, 0, 45, 0, 170, 0.7, 0.965, 8000,TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "Green", "Orange", "Pink", "White", "Blue", "LightGrey", "Magenta", "Mayeeta", "Red"}), 18, -2, "Created by Bidahochi"),
	pch120("PCH-120 Commute", PCH120Commute.class, ItemIDs.minecartPCH120.item, "electric",1400, 120, 0, 5, 0, 160, 0.8, 0.985, 0, TraincraftUtil.getBytesFromColors(new String[] {"White", "Blue", "Red", "Green"}), 18, -2.7, "Model by Bidahochi, train by PeachMaster"),
	pch120coach("PCH-120 Commute Car", PCH120Coach.class, ItemIDs.minecartPCH120Coach.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0,TraincraftUtil.getBytesFromColors(new String[] {"White", "Blue", "Red", "Green"}), 0, 0,"Model by Bidahochi"),
	//geometryCar("NXTrack Geometry Car", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar.class, ItemIDs.minecartGeometryCar.item, "geometry car", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey"}), 18, 0, "Model by Bidahochi, train by PeachMaster.\n It checks the railroad for things not up to standard."),
	amfleet("Amfleet", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.Amfleet.class, ItemIDs.minecartAmfleet.item, "passenger", 2, TraincraftUtil.getBytesFromColors(new String[] {"White", "Grey", "LightGrey", "LightBlue", "Red", "Blue", "Green"}), 0, 0, "Model by Valaktik, Updated by Bidahochi"),
	SW1("SW1", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1.class, ItemIDs.minecartSW1.item, "diesel", 600, 105, 0, 45, 0, 160, 0.6, 0.890, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Green", "Blue", "Black", "Pink", "Cyan", "LightGrey", "White"}), 10, -2.1, "model by Bida as usual kEk"),
	H1044("H1044", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH1044.class, ItemIDs.minecartH1044.item, "diesel", 1000, 97, 0, 45, 0, 175, 0.75, 0.92, 16000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow", "Black", "Red", "Blue", "Grey", "LightBlue", "Orange", "White", "Lime"}), 18, -2.2, "Model by Bida"),
	HighrailTruck("Highrail Truck", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class, ItemIDs.minecartHighrailTruck.item, "diesel", 90, 80, 0, 10, 0, 140, 0.7, 0.8, 1000,TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "White", "LightGrey"}),18, 2.7, "Model by MessibOOmer"),
	freightRibbedHopper("Ribbed Hopper", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.RibbedHopper.class, ItemIDs.minecartRibbedHopper.item, "freight", 6, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Cyan", "LightGrey", "Red", "Brown"}), 0, 54, "Model by Bidahochi"),
	Thanos("Thanos", com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, ItemIDs.minecartThanos.item, "electric", 1000001, 6210000, 0, 69, 0, 1, 6, 3, 0, null, 18, -1, "You don't want to mess with the Universe's Best"),
	U23B("U23B", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23B.class, ItemIDs.minecartU23B.item, "diesel", 2250, 70, 0, 55, 0, 180, 0.7, 0.91, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Orange", "LightGrey", "Pink", "Lime", "Blue", "LightBlue", "Black", "Green","Purple", "Brown"}), 10, -3.7, "Made by Bida"),
	SW1500("SW1500", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1500.class, ItemIDs.minecartSW1500.item, "diesel", 1500, 105, 0, 50, 0, 180, 0.85, 0.97, 18000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Blue", "Orange", "Pink", "White"}), 10, -2.3, "Expertly Crafted by Bida"),
	SD45dash2("SD45-2", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, ItemIDs.minecartSD45dash2.item, "diesel", 3600, 132, 0, 65, 0, 190, 0.75, 0.89, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "White", "Black", "Orange", "Blue", "Pink", "Magenta", "LightBlue", "Yellow"}), 10, -4.6, "Model by Bida"),
	SD40dash2("SD40-2", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2.class, ItemIDs.minecartSD40dash2.item, "diesel", 3000, 105, 0, 60, 0, 190, 0.75, 0.89, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Green", "Pink", "Magenta", "White", "Yellow", "Black", "Blue", "LightGrey", "Red", "Lime", "Brown"}), 10, -4.6, "Model by the great and powerful Bida"),
	bawx40highcube("40highcube", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.bawx40highcube.class, ItemIDs.minecart40highcube.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Green", "Cyan", "Orange", "Grey", "Red"}), 0, 40, "Model by Prof Binky"),
	FRED("FRED", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.FRED.class, ItemIDs.minecartFRED.item, "misc", 0.2, null, 0, 1, "i figured this would be fun to have -bida"), //stupid thing doesnt break or even couple
	CF7("CF7", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7.class, ItemIDs.minecartCF7.item, "diesel", 1500, 116, 0, 45, 0, 185, 0.8, 0.9, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red", "LightGrey", "White", "Cyan", "Lime", "Magenta", "Purple", "Green", "Blue", "Orange", "Pink"}), 10, -3, "Model version: 4.5 By Bida"),
	SD9("SD9", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, ItemIDs.minecartSD9.item, "diesel", 1750, 104, 0, 50, 0, 190, 0.75, 0.89, 19000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Cyan", "Orange", "Grey", "White", "Red"}), 10, -3.1, "Bida made this, surprising isnt it?"),
	//SD9 note: model is getting a huge upgrade and skins will need to be remade, so if you encounter texture issues on the SD9 in the next while, thats most likely because the new skins havent been made yet for it. -Bid

	WoodchipHopper("Woodchip Hopper", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.WoodchipHopper.class, ItemIDs.minecartWoodchipHopper.item, "freight", 5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Blue", "Green", "Orange", "Red", "White"}), 0, 50, "Cargo: Wood, Model by Binky"),
	OreJenny("Ore Jenny", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.OreJenny.class, ItemIDs.minecartOreJenny.item, "freight", 0.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Red", "Orange", "Pink", "Black"}), 0, 27, "Cargo: Ore (dUh), Model by Binky"),
	SF30C("SF30C", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, ItemIDs.minecartSF30C.item, "diesel", 3000, 121, 0, 55, 0, 195, 0.7, 0.8, 21000, null, 10, -4.3, "model by BIda"),
	SDL39("SDL39", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, ItemIDs.minecartSDL39.item, "diesel", 2300, 152, 0, 60, 0, 180, 0.8, 0.9, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Blue", "Red"}), 10, -3, "model by binky"),
	F7A("F7A", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7A.class, ItemIDs.minecartF7A.item, "diesel", 1500, 133, 0, 50, 0, 180, 0.7, 0.79, 20000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Black", "Orange", "Yellow", "Grey", "Red"}), 10, -3, "Model by Binky and Bida"),
	F7B("F7B", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7B.class, ItemIDs.minecartF7B.item, "diesel", 1500, 133, 0, 50, 0, 180, 0.7, 0.79, 20000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Black", "Orange", "Grey", "Red", "Yellow"}), 10, -3, "Model by Binky and Bida. Its a B unit, but it can move on its own!"),
	geGenesis("Ge Genesis", com.jcirmodelsquad.tcjcir.vehicles.locomotives.GeGenesis.class, ItemIDs.minecartGeGenesis.item, "diesel", 4250, 177, 0, 55, 0, 175, 0.93, 0.94, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "White"}), 10, -5.5, "Model by MessicOOmer"),
	ES44("ES44", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44.class, ItemIDs.minecartES44.item, "diesel", 4400, 120, 0, 60, 0, 190, 0.7, 0.8, 25000, TraincraftUtil.getBytesFromColors(new String[] {"Lime", "Orange", "Red", "Yellow", "Blue", "LightGrey", "Grey", "Black"}), 10, -4.3, "Model by Eddie Dalton, upgraded by Bida"),
	BombCart("Payload", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.BombCart.class, ItemIDs.minecartBombCart.item, "misc", 3, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Red", "Black", "Blue", "Cyan", "Green", "Grey", "Brown", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Yellow", "White"}), 0, 0, "Who is not pushing ze Cart!?"),
	//HuskyStackWellcar("53' HuskyStack Wellcar", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.HuskyStackWellcar.class, ItemIDs.minecartHuskyStackWellcar.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Pink"}), 0,0, "Model by Bidahochi"),
	Boxcab23Ton("23 Ton Boxcab", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, ItemIDs.minecartBoxcab23Ton.item, "diesel", 150, 40, 0, 20, 0, 100, 0.7, 0.8, 5000,  TraincraftUtil.getBytesFromColors(new String[] {"Blue", "White", "Black", "Green"}), 10, -1.5, "Bida Model, as per the usual"),
	//note on the boxcab: check the RenderEnum for more info related to its hitboxes

	LUengine("London Underground Engine", com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricLUengine.class, ItemIDs.minecartLUengine.item, "electric", 600, 100, 0, 10, 0, 100, 0.7, 0.8, 1000, null, 18, -2, "LU Models by Hariesh"),
	LUpassenger("London Underground Passenger Car", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.LUpassenger.class, ItemIDs.minecartLUpassenger.item, "passenger", 0.3, null, 0, 0, "LU Models by Hariesh"),
	//testControlCar("Test Control Car", TestControlCar.class, ItemIDs.testControlCar.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey"}), 18, 0),
	PCH100H("PCH-100H", com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, ItemIDs.minecartExperimentalHydrogenTrain.item, "hydrogen",900, 100, 0, 6, 0, 160, 0.8, 0.985, 7000, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Blue"}), 18,  -2.6, "Powered by Mekanism Hydrogen, Original model by Bidahochi, modified by PeachMaster"),
	PCH100Coach("PCH-100H Coach", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.PCH100HCoach.class, ItemIDs.minecartPCH100HCoach.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Blue"}), 0, 0,"Original model by Bidahochi, modified by PeachMaster"),
	GP13("GP13", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP13.class, ItemIDs.minecartGP13.item, "diesel", 2510,90,0,50,0,200,0.74,0.96,20000, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "LightBlue", "Black", "Orange", "White", "Yellow"}), 10, 1.4, "Fictional Rebuild of a GP7, Uses the original GP40 model"),
	GP30("GP30", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP30.class, ItemIDs.minecartGP30.item, "diesel", 2250, 114, 0, 50, 0, 180, 0.7, 0.91, 18000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Black", "Yellow", "Blue", "Orange", "White", "Grey"}), 10, -3.5, "Made by Bida"),
	VBShay("2TruckVerticalBoilerShay", com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamVBShay.class, ItemIDs.minecartVBShay2.item, "steam", 280,55,0,50,160,120,0.7,0.99,5000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey"}),15,-1.3, "Made with care by Bida"),
	MillGondola("52footMillGondola", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.MillGondola.class, ItemIDs.minecartMillGondola.item, "freight", 5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black"}), 30, 50, "Made by Bida"),
	aipkitExplorer("Aipkit Explorer", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AipkitExplorer.class, ItemIDs.minecartAipkitExplorer.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0, null, 0, 0,"Built from scratch by PeachMaster"),
	FOLM1B("FOL-M1B", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFOLM1B.class, ItemIDs.minecartFOLM1B.item, "diesel", 5000, 110, 0, 10, 0, 170, 0.7, 0.965, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue", "Black"}), 18, -3.8, "Fictional B unit for the Fictional loco from Factorio"),
	Class345("Class 345", com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricClass345.class, ItemIDs.minecartClass345.item, "electric", 1500, 145, 0,6, 0, 100, 1.1, 0.95, 1000, null, 18, -3, "Class 345 by hariesh"),
	SD70Mac("SD70Mac", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70Mac.class, ItemIDs.minecartSD70Mac.item, "diesel", 4000, 112, 0, 15, 0, 150, 0.6, 0.8, 17000, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Grey", "LightGrey", "LightBlue", "Yellow", "Black","Green", "Orange"}), 18, -4, "Original Model by Eddie, upgraded by Bida"),
	Class345Coach("Class345", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.Class345Coach.class, ItemIDs.minecartClass345Coach.item, "passenger", 0, 0, 1.5,0 , 0, 0, 0,0,0,null,0,0,"Class 345 Coach by hariesh"),
	C424("C424", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC424.class, ItemIDs.minecartC424.item, "diesel", 2400, 113, 0, 60, 0, 190, 0.7, 0.8, 19000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Yellow", "Orange", "White", "Cyan"}), 10, -3.6, "Yet Another Bida Model kek"),
	amfleet2("Amfleet2", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.Amfleet2.class, ItemIDs.minecartAmfleet2.item, "passenger", 2, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Grey"}), 0, 0, "Amfleet1 by Valaktik, Updated by Bidahochi, Converted to Amfleet2 by Anonymous Sponser"),
	TGVmobile("TGVmobile", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTGVmobile.class, ItemIDs.minecartTGVMobile.item, "diesel", 200, 350, 0, 10, 0, 140, 0.9, 0.9, 1000,null,18, 2.7, "Yes, this is real, minus the highrail gear. Made by Bida at 3AM"),
	Hustler("Hustler", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, ItemIDs.minecartHustler.item, "diesel", 150, 30, 0, 50, 0, 170, 0.6, 0.7, 9000, null, 10, -2, "Made by BigJ"),
	F40PH("F40PH", com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF40PH.class, ItemIDs.minecartF40PH.item, "diesel", 3000, 103, 9, 50, 0, 170, 0.75, 0.95, 11000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Red", "Yellow", "Cyan"}), 10, -3.5, "Model by Bida & Mr Coomer"),
	;

	/*passengerICE1_Restaurant("ICE Restaurant", EntityPassengerICE_Restaurant.class,
							 ItemIDs.minecartICE1_Restaurant.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0),
	what is this for and why does it still exist?*/

//String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors,

	private String internalName;
	private Class entityClass;
	private Item item;
	private String trainType;
	private int MHP;
	private int maxSpeed;
	private double mass;
	private int fuelConsumption;
	private int waterConsumption;
	private int heatingTime;
	private double accelerationRate;
	private double brakeRate;
	private int tankCapacity;
	private byte[] colors;
	private int guiRenderScale;
	private double bogieLocoPosition;
	private String additionnalTooltip;
	private int cargoCapacity;

	/**
	 *
	 * @param internalName : Only used by EntityRegistry
	 * @param entityClass
	 * @param item
	 * @param trainType: "steam", "diesel", "freight", "passenger", "special", "flat", "electric"
	 * @param MHP: power of the locomotive
	 * @param maxSpeed
	 * @param mass (will be multiplied by 10 internally. That means putting 0.1 here will create a mass of 1 Ton in game)
	 * @param fuelConsumption: 1 unit is consumed every x ticks
	 * @param waterConsumption: 1 unit is consumed every x ticks
	 * @param heatingTime
	 * @param accelerationRate: generally around 0.45
	 * @param brakeRate: generally around 0.98
	 * @param tankCapacity
	 * @param colors: an array with all possible colors. Index 0 is used as default color when train is first spawned. leave null if no color available
	 * @param guiRenderScale: scale at which the entity will be rendered inside the GUI (crafting GUI)
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, byte[] colors, int guiRenderScale, double bogieLocoPosition){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPosition;
	}

	/**
	 * Constructor for additionnal tooltips on the item
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param MHP
	 * @param maxSpeed
	 * @param mass
	 * @param fuelConsumption
	 * @param waterConsumption
	 * @param heatingTime
	 * @param accelerationRate
	 * @param brakeRate
	 * @param tankCapacity
	 * @param colors
	 * @param guiRenderScale
	 * @param bogieLocoPositions
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, byte[] colors, int guiRenderScale, double bogieLocoPositions, String additionnalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPositions;
		this.additionnalTooltip=additionnalTooltip;
	}

	/**
	 * Constructor for freight carts
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param mass
	 * @param colors
	 * @param guiRenderScale
	 * //@param bogieLocoPositions
	 * //@param bogieUtilityPositions
	 * @param cargoCapacity
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType, double mass, byte[] colors, int guiRenderScale, int cargoCapacity, String additionnalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.mass=mass;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.additionnalTooltip=additionnalTooltip;
		this.cargoCapacity = cargoCapacity;
	}

	public String getInternalName(){
		return this.internalName;
	}

	public Item getItem(){
		return this.item;
	}

	public String getTrainType(){
		return this.trainType;
	}

	public int getMHP(){
		return this.MHP;
	}

	public int getMaxSpeed(){
		return this.maxSpeed;
	}

	public double getMass(){
		return this.mass;
	}

	public int getFuelConsumption(){
		return this.fuelConsumption;
	}

	public int getWaterConsumption(){
		return this.waterConsumption;
	}

	public int getHeatingTime(){
		return this.heatingTime;
	}

	public double getAccelerationRate(){
		return this.accelerationRate;
	}

	public double getBrakeRate(){
		return this.brakeRate;
	}

	public int getTankCapacity(){
		return this.tankCapacity;
	}

	public byte[] getColors(){
		return this.colors;
	}

	public double getBogieLocoPosition(){
		return this.bogieLocoPosition;
	}


	public Class getEntityClass() {
		return this.entityClass;
	}

	public int getGuiRenderScale(){
		return this.guiRenderScale;
	}

	public String getAdditionnalTooltip(){
		return this.additionnalTooltip;
	}

	public int getCargoCapacity(){
		return cargoCapacity;
	}

	public static EnumTrains getCurrentTrain(Item item){
		if(item==null)return null;
		for (EnumTrains trains : EnumTrains.values()) {
			if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
				return trains;
			}
		}
		return null;
	}

	public static AbstractTrains getEntityWithItem(Item item, World world, double x, double y, double z){
		if(item==null)return null;
		for (EnumTrains trains : EnumTrains.values()) {
			if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
				return trains.getEntity(world, x, y, z);
			}
		}
		return null;
	}

	public AbstractTrains getEntity(World world){
		try {
			return (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	public AbstractTrains getEntity(World world, double x, double y, double z){
		try {
			if(world.isRemote){
				entityClass.getConstructor(World.class).newInstance(world);
			} else {
				return (AbstractTrains) entityClass.getConstructor(World.class, double.class, double.class, double.class).newInstance(world, x, y, z);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}


}
