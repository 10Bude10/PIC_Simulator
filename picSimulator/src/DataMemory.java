public class DataMemory {

	int[] memory;
	boolean bank0;
	int addressOffset = 0x80;

	public DataMemory() {

		memory = new int[0xFF];// Int-Array mit der Gr��e FF
		this.initMemory();

	}
	
	public void initMemory() {

		// Kompletter Speicherbereich mit 0 �berschreiben
		for (int i = 0; i < memory.length; i++) {
			memory[i] = 0b00000000;
		}

		// SFR mit vorbelegten Werten f�llen, wenn diese nicht 0 oder unbekannt
		// sind

		// 03h Status: 0001 1xxx
		memory[0x03] = 0b00011000;
		// 81h TMR0:1111 1111
		memory[0x81] = 0b11111111;
		// 83h Status 0001 1xxx
		memory[0x83] = 0b00011000;
		// 85h TRIS A ---1 1111:
		memory[0x85] = 0b00011111;
		// 86h TRIS B 1111 1111
		memory[0x86] = 0b11111111;
	}

	// Kompletten 8 Bit aus Register an Adresse ausgeben
	public int readFileValue(int address) {

		// Wenn Bank 1 aktiv, dann Offset addieren
		if (!this.bank0Active()) {
			address = address + addressOffset;
		}
		return memory[address];
	}

	// Komplette 8 Bit in Register an Addresse schreiben
	public void writeFileValue(int address, int value) {

		// Wird immer zuerst in bank 0 geschrieben und anschlie�end nach Bank 1
		// gespiegelt

		// Adresse auf Adresse in Bank 1 umwandeln
		int tmpAddress = address & 0b01111111;

		switch (tmpAddress) {
		case 0:
			memory[tmpAddress] = value;
			memory[(tmpAddress | 0b10000000)] = value;
			break;
		case 2:
			memory[tmpAddress] = value;
			memory[(tmpAddress | 0b10000000)] = value;
		case 3:
			memory[tmpAddress] = value;
			memory[(tmpAddress | 0b10000000)] = value;
		case 4:
			memory[tmpAddress] = value;
			memory[(tmpAddress | 0b10000000)] = value;
		case 0x0A:
			memory[tmpAddress] = value;
			memory[(tmpAddress | 0b10000000)] = value;
		case 0x0B:
			memory[tmpAddress] = value;
			memory[(tmpAddress | 0b10000000)] = value;
		default:
			memory[address] = value;
			break;
		}

	}

	// Bit an der Adresse lesen
	public int readBitValue(int address, int position) {

		// Nach rechts shiften, bis gew�nschtes Bit hinten steht, dann Rest
		// ausblenden
		int value = memory[address] >> position;
		value = value & 0b00000001;

		return value;
	}

	// Bit an der Adresse und Position mit Value schreiben
	public void writeBitValue(int address, int position, int value) {

		// Wird immer zuerst in bank 0 geschrieben und anschlie�end nach Bank 1
		// gespiegelt
		int mask = (int) Math.pow(2, position);
		int tmpAddress = address & 0b01111111;

		switch (tmpAddress) {
		case 0:
			if (value == 1) {
				memory[tmpAddress] = memory[tmpAddress] | mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						| mask;
			} else {
				mask = ~mask;
				memory[tmpAddress] = memory[tmpAddress] & mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						& mask;
			}
			break;
		case 2:
			if (value == 1) {
				memory[tmpAddress] = memory[tmpAddress] | mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						| mask;
			}

			else {
				mask = ~mask;
				memory[tmpAddress] = memory[tmpAddress] & mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						& mask;
			}
			break;
		case 3:
			if (value == 1) {
				memory[tmpAddress] = memory[tmpAddress] | mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						| mask;
			}

			else {
				mask = ~mask;
				memory[tmpAddress] = memory[tmpAddress] & mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						& mask;
			}
			break;
		case 4:
			if (value == 1) {
				memory[tmpAddress] = memory[tmpAddress] | mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						| mask;
			}

			else {
				mask = ~mask;
				memory[tmpAddress] = memory[tmpAddress] & mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						& mask;
			}
			break;
		case 0x0A:
			if (value == 1) {
				memory[tmpAddress] = memory[tmpAddress] | mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						| mask;
			}

			else {
				mask = ~mask;
				memory[tmpAddress] = memory[tmpAddress] & mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						& mask;
			}
			break;
		case 0x0B:
			if (value == 1) {
				memory[tmpAddress] = memory[tmpAddress] | mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						| mask;
			}

			else {
				mask = ~mask;
				memory[tmpAddress] = memory[tmpAddress] & mask;
				memory[(tmpAddress | 0b10000000)] = memory[(tmpAddress | 0b10000000)]
						& mask;
			}
			break;
		default:
			if (value == 1) {

				memory[address] = memory[address] | mask;
			}

			else {
				mask = ~mask;
				memory[address] = memory[address] & mask;
			}

			break;
		}

	}

	public void setCarryFlag() {
		// In beiden Statusregistern das flag setzen
		this.writeBitValue(03, 0, 1);
		this.writeBitValue(83, 0, 1);
	}

	public void deleteCarryFlag() {
		// In beiden Statusregistern das Flag l�schen
		this.writeBitValue(03, 0, 0);
		this.writeBitValue(83, 0, 0);

	}

	public void setZeroFlag() {
		// In beiden Statusregistern das flag setzen
		this.writeBitValue(03, 2, 1);
		this.writeBitValue(83, 2, 1);
	}

	public void deleteZeroFlag() {
		// In beiden Statusregistern das Flag l�schen
		this.writeBitValue(03, 2, 0);
		this.writeBitValue(83, 2, 0);
	}

	public void activateBank(boolean bank0) {

	}

	public boolean bank0Active() {
		// Wenn RP0 im Statusregiser 0 ist = Bank 0 wenn 1 dann Bank 1
		if (this.readBitValue(03, 5) == 0) {
			return true;
		} else {
			return false;
		}

	}

}